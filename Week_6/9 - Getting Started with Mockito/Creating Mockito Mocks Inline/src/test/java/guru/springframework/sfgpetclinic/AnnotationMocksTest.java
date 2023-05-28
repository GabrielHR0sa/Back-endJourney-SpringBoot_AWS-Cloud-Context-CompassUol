package guru.springframework.sfgpetclinic;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class AnnotationMocksTest {
  
    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Map<String, Object> mapMok;

    @Test
    void testMock(){
        mapMok.put("keyvalue", "foo");
    }
}
