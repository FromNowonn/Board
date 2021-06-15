package Demo.CRUD.Board.service;

import Demo.CRUD.Board.dto.BoardDto;
import Demo.CRUD.Board.entity.Board;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class BoardServiceImpl implements BoardService{
    @Override
    public Long register(BoardDto dto){
        log.info("DTO================");
        log.info(dto);

        Board entity = dtoToEntity(dto);
        log.info(entity);
        return null;
    }
}
