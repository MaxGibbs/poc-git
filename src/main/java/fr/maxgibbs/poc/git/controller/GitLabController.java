package fr.maxgibbs.poc.git.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/gitlab")
@RequiredArgsConstructor
public class GitLabController {

    @GetMapping("/fuji")
    public List<String> getFujiInformation() {
        return new ArrayList<>();
    }
}
