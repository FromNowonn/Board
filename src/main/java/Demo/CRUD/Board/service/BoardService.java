package Demo.CRUD.Board.service;

import Demo.CRUD.Board.dto.BoardDto;
import Demo.CRUD.Board.entity.Board;

public interface BoardService {
    Long register(BoardDto dto);
    default Board dtoToEntity(BoardDto dto){
        Board entity = Board.builder()
                .boardId(dto.getBoardId())
                .boardTitle(dto.getBoardTitle())
                .boardWriter(dto.getBoardWriter())
                .boardContents(dto.getBoardContents())
                .build();
        return entity;
    }
}
