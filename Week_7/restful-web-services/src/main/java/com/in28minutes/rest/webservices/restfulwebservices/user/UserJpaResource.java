package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in28minutes.rest.webservices.restfulwebservices.jpa.PostRepository;
import com.in28minutes.rest.webservices.restfulwebservices.jpa.UserRepository;

import jakarta.validation.Valid;


@RestController
public class UserJpaResource {

    private UserRepository userRepository;

    private PostRepository postRepository;

    public UserJpaResource(UserRepository userRepository, PostRepository postRepository){
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }

    /*
     * Retorna todos os usuários, para acessá-lo na URL digitar o GetMapping
     * lista todos os usuários disponíveis
     */
    @GetMapping("/jpa/users")
    public List<User> retrieveAllUsers(){
        return userRepository.findAll();
    }

    /*
     * Retorna somente 1 usuário referente ao Id pesquisado após /users
     * Recebe a lista de users, faz a busca e retorna somente 1
     * Caso o id pesquisado não exista, retorna um erro definido no usernotfoundexception
     */
    @GetMapping("/jpa/users/{id}")
    public EntityModel<User> retrieveUser(@PathVariable int id){
        Optional<User> user = userRepository.findById(id);

        if(user.isEmpty()) 
        throw new UserNotFoundException("id:" +id);

        EntityModel<User> entityModel = EntityModel.of(user.get());

        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUsers());
        entityModel.add(link.withRel("all-users"));

        return entityModel;
    }

    /*
     * deleta o usuário definido aopós /users
     * DELETE executado na extenção do chrome
     */
    @DeleteMapping("/jpa/users/{id}")
    public void deleteUser(@PathVariable int id){
        userRepository.deleteById(id);
    }

    @GetMapping("/jpa/users/{id}/posts")
    public List<Post> retrievePostsForAUser(@PathVariable int id){
        Optional<User> user =  userRepository.findById(id);

        if(user.isEmpty()) 
        throw new UserNotFoundException("id:" +id);

        return user.get().getPosts();
       
    }

    /*
     * atravez do navegador, insere um novo usuário atravez do 
     * POST executado na extenção do chrome API Tester
     * para adicionar não é necessario passar o id, somente os outros dados
     * @Valid, valida as informações que serão inseridas no createUser, 
     * as validações foram definidas no User.java, nos campos nome e date
     */
    @PostMapping("/jpa/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        
        User savedUser = userRepository.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(savedUser.getId())
            .toUri();
        /*
         * retornando uma resposta de 201, sucesso na criação e 
         * gerando a url do novo usuário criado
         */
        return ResponseEntity.created(location).build();
    }

    @PostMapping("/jpa/users/{id}/posts")
    public ResponseEntity<Object> createPostsForAUser(@PathVariable int id, @Valid @RequestBody Post post){
        Optional<User> user =  userRepository.findById(id);

        if(user.isEmpty()) 
        throw new UserNotFoundException("id:" +id);

        post.setUser(user.get());
        Post savedPost = postRepository.save(post);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(savedPost.getId())
            .toUri();
        return ResponseEntity.created(location).build();
       
    }
    

}
