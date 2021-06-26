//package Demo.CRUD.Board.service;
//
//import Demo.CRUD.Board.dto.BoardDto;
//import Demo.CRUD.Board.dto.PageRequestDto;
//import Demo.CRUD.Board.dto.PageResultDto;
//import Demo.CRUD.Board.entity.Board;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class BoardServiceTest {
//    @Autowired
//    private BoardService service;
//    @Test
//    public void testRegister(){
//        BoardDto boardDto = BoardDto.builder()
//                .boardTitle("Sample Title..")
//                .boardContents("Sample contents")
//                .boardWriter("Sample writer")
//                .build();
//        System.out.println(service.register(boardDto));
//    }
//    @Test
//    public void testList(){
//        PageRequestDto pageRequestDto = PageRequestDto.builder().page(1).size(10).build();
//        PageResultDto<BoardDto, Board> resultDto = service.getList(pageRequestDto);
//
//        System.out.println("PRE : "+resultDto.isPrev());
//        System.out.println("NEXT : "+resultDto.isNext());
//        System.out.println("TOTAL : "+resultDto.getTotalPage());
//        System.out.println("==============================");
//        for(BoardDto boardDto : resultDto.getDtoList()){
//            System.out.println(boardDto);
//        }
//        System.out.println("==============================");
//        resultDto.getPageList().forEach(i->System.out.println(i));
//    }
//
//}
