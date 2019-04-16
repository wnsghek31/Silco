import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Champion {
    private String name;
    private String position;
}

// add dependencies 하고나서 enable 뭐시기 해줘야 들어감. 그리고 pom.xml에다 dependency 넣어줘야함
// project structure에서 modules에서 버전8로 해줘야지 람다식이 됨