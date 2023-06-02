/*
O método findOnetoma um parâmetro de tipo entero chamado id, que se supõe ser o identificador do usuário que está buscando.

O código utiliza Java 8 Streams e lambdas para processar a lista de usuários.

A linha Predicate<? super User> predicate = user -> user.getId().equals(id);cria um predicado usando uma expressão lambda. O predicado é usado para filtrar os usuários com base no identificador. A expressão lambda compara o identificador do usuário ( user.getId()) com o identificador que passa como parâmetro ( id).

A próxima linha return users.stream().filter(predicate).findFirst().get();realiza o seguinte processo:

users.stream()converta a lista de usuários em um Stream, o que permite realizar operações em sequência sobre ela.
filter(predicate)filtrar o Stream de usuários usando o predicado criado anteriormente. Isso significa que apenas se mantendrán los usuarios cuyo identificador coincida con el valor del parametro id.
findFirst()obtenha o primer usuario que acumule com o filtro. Se não houver coincidências, devuelve un Optionalvacío.
get()obtenha o valor do Optional. Nesse caso, se você encontrar um usuário que esteja obstruindo o filtro, ele deverá ser usado. Se você não encontrar nenhum usuário, isso gerará uma exceção NoSuchElementException.F
*/

package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    //conta o id do usuario inserido
    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Eve", LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount, "Jim", LocalDate.now().minusYears(20)));
        users.add(new User(++usersCount, "Helena", LocalDate.now().minusYears(21)));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }

}
