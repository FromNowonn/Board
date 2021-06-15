package Demo.CRUD.Board.service;

import Demo.CRUD.Board.dto.BoardDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardServiceTest {
    @Autowired
    private BoardService service;
    @Test
    public void testRegister(){
        BoardDto boardDto = BoardDto.builder()
                .boardTitle("Sample Title..")
                .boardContents("Sample contents")
                .boardWriter("Sample writer")
                .build();
        System.out.println(service.register(boardDto));
    }

}
