//package Demo.CRUD.Board.repository;
//
//import Demo.CRUD.Board.entity.Board;
//import Demo.CRUD.Board.entity.QBoard;
//import com.querydsl.core.BooleanBuilder;
//import com.querydsl.core.types.dsl.BooleanExpression;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Optional;
//import java.util.stream.IntStream;
//
//@SpringBootTest
//public class BoardRepositoryTest {
//
//    @Autowired
//    private BoardRepository boardRepository;
//
//    @Test
//    public void insertTest(){
//        IntStream.rangeClosed(1, 100).forEach(i->{
//            Board board = Board.builder()
//                    .boardTitle("Title test"+i)
//                    .boardContents("Content test"+i)
//                    .boardWriter("Writer test"+i)
//                    .build();
//            System.out.println(boardRepository.save(board));
//        });
//    }
//
//    @Test
//    public void updateTest(){
//        Optional<Board> result = boardRepository.findById(30L);
//        if(result.isPresent()){
//            Board board = result.get();
//            board.changeTitle("change hello");
//            board.changeContent("change gg");
//            boardRepository.save(board);
//        }
//    }
//
//
//    @Test
//    public void testQuery1(){
//        Pageable pageable = PageRequest.of(0,10, Sort.by("boardId").descending());
//        QBoard qBoard = QBoard.board;
//
//        String keyword = "1";
//        BooleanBuilder builder = new BooleanBuilder();
//        BooleanExpression expression = qBoard.boardTitle.contains(keyword);
//        builder.and(expression);
//        Page<Board> result = boardRepository.findAll(builder,pageable);
//        result.stream().forEach(board -> {
//            System.out.println(board);
//        });
//    }
//    @Test
//    public void testQuery2(){
//        Pageable pageable = PageRequest.of(0,10, Sort.by("boardId").descending());
//        QBoard qBoard = QBoard.board;
//
//        String keyword = "1";
//        BooleanBuilder builder = new BooleanBuilder();
//        BooleanExpression exTitle = qBoard.boardTitle.contains(keyword);
//        BooleanExpression exContents = qBoard.boardTitle.contains(keyword);
//        BooleanExpression exAll = exTitle.or(exContents);
//        builder.and(exAll);
//        builder.and(qBoard.boardId.gt(0L));
//        Page<Board> result = boardRepository.findAll(builder,pageable);
//        result.stream().forEach(board -> {
//            System.out.println(board);
//        });
//    }
//
//}
