package com.exam.exception;


import jakarta.validation.ConstraintViolationException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = ConstraintViolationException.class)
//    public String handleException(Exception e, Model model) {
    public String handleException(Exception e, RedirectAttributes redirectAttributes, Model model) {

        redirectAttributes.addFlashAttribute("errorMessage", "유효성 검증 실패");
        return "redirect:add-todo"; // PRG 패턴
    }
}
