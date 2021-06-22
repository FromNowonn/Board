package Demo.CRUD.Board.controller;

import Demo.CRUD.Board.dto.BoardDto;
import Demo.CRUD.Board.dto.PageRequestDto;
import Demo.CRUD.Board.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("UserBoard")
@RequiredArgsConstructor
@Log4j2

public class BoardController {
    private final BoardService service;
    @GetMapping("/")
    public String index(){

        return "redirect:vendor/index";
    }
    @GetMapping("list")
    public void list(PageRequestDto pageRequestDto, Model model){
        log.info("list============"+pageRequestDto);
        model.addAttribute("result",service.getList(pageRequestDto));
    }

    @GetMapping("register")
    public void register(){
        log.info("register get");

    }

    @GetMapping("boardWelcome")
    public void welcome(){
        log.info("welcome get");
    }

    @PostMapping("register")
    public String registerPost(BoardDto dto, RedirectAttributes redirectAttributes){
        log.info("dto"+dto);
        Long boardId = service.register(dto);
        redirectAttributes.addFlashAttribute("msg",boardId);
        return "redirect:list";
    }

    @RequestMapping("static/vendor")
    @GetMapping("index")
    public void host(){
        log.info("first page");
    }

}
