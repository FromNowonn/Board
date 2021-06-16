package Demo.CRUD.Board.service;

import Demo.CRUD.Board.dto.BoardDto;
import Demo.CRUD.Board.dto.PageRequestDto;
import Demo.CRUD.Board.dto.PageResultDto;
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
    default BoardDto entityToDto(Board entity){
        BoardDto dto = BoardDto.builder()
                .boardId(entity.getBoardId())
                .boardTitle(entity.getBoardTitle())
                .boardWriter(entity.getBoardWriter())
                .boardContents(entity.getBoardContents())
                .regDate(entity.getRegDate())
                .modDate(entity.getModDate())
                .build();
        return dto;
    }

    PageResultDto<BoardDto, Board> getList(PageRequestDto pageRequestDto);
}
