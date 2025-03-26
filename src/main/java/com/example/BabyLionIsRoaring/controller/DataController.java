package com.example.BabyLionIsRoaring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @GetMapping("/{data}")
    public ResponseEntity<Map<String, String>> readData(@PathVariable String data) {
        return ResponseEntity.ok(Map.of("message", data + "에 대한 조회 요청이 발생하였습니다."));
    }

    @GetMapping
    public ResponseEntity<Map<String, String>> searchData(@RequestParam String keyword) {
        return ResponseEntity.ok(Map.of("message", keyword + "에 대한 검색 요청이 발생하였습니다."));
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> createData(@RequestBody Map<String, String> body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                Map.of("message", body.get("data") + "에 대한 생성 요청이 발생하였습니다."));
    }

    @PutMapping("/{data}")
    public ResponseEntity<Map<String, String>> overwriteData(
            @PathVariable String data, @RequestBody Map<String, String> body) {
        return ResponseEntity.ok(
                Map.of("message", data + "에 대해 " + body.get("data") + "로의 덮어쓰기 또는 생성 요청이 발생하였습니다."));
    }

    @PatchMapping("/{data}")
    public ResponseEntity<Map<String, String>> modifyData(
            @PathVariable String data, @RequestBody Map<String, String> body) {
        return ResponseEntity.ok(
                Map.of("message", data + "에 대해 " + body.get("data") + "로의 일부 수정 요청이 발생하였습니다."));
    }

    @DeleteMapping("/{data}")
    public ResponseEntity<Map<String, String>> deleteData(@PathVariable String data) {
        return ResponseEntity.ok(Map.of("message", data + "에 대한 삭제 요청이 발생하였습니다."));
    }
}