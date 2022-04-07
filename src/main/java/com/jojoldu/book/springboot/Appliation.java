import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@SpringBootApplication으로 인해 스프링 부트의 자동설정, 스프링 Bean 일기와 셍상을 모두 자동으로 설정
* @SpringBootApplication이 있는 위치부터 설정을 읽어가므로 이 클래스는 항상 프로젝트의 최상단에 위치*/
@SpringBootApplication
public class Application { //프로젝트의 메인 클랙스
    public static void main(String[] args){
        /*main 메소드에서 실행하는 springApplication.run으로 인해 내장 WAS (웹 에플리케이션 서버)를 실행
        이로 인해 톰켓 설치가 필요없고, 스피링 부트로 만들어진 jar 파일로 실행
        스프링부트는 내장 WAS를 상요하는것을 권장 : 언제 어디서나 같은 환경에서 스프링 부터를 배호살수 있기때문
        * */
        SpringApplication.run(Application.class, args);
    }
}
