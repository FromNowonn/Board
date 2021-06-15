package Demo.CRUD.Board.service;

import Demo.CRUD.Board.dto.BoardDto;
import Demo.CRUD.Board.entity.Board;
import Demo.CRUD.Board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
    private final BoardRepository repository;
    @Override
    public Long register(BoardDto dto){
        log.info("DTO================");
        log.info(dto);

        Board entity = dtoToEntity(dto);
        log.info(entity);
        repository.save(entity);
        return entity.getBoardId();
    }
}
