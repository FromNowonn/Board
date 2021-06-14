package Demo.CRUD.Board.repository;

import Demo.CRUD.Board.entity.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;
    @Test
    public void insertTest(){
        IntStream.rangeClosed(1, 100).forEach(i->{
            Board board = Board.builder()
                    .board_title("Title test"+i)
                    .board_contents("Content test"+i)
                    .board_writer("Writer test"+i)
                    .build();
            System.out.println(boardRepository.save(board));
        });
    }
}
