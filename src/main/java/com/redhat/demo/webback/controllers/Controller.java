package com.redhat.demo.webback.controllers;

import com.redhat.demo.webback.models.MotionPicture;
import com.redhat.demo.webback.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/")
public class Controller {
    @Autowired
    PictureService pictureService;

    @GetMapping("")
    public List<MotionPicture> list(){
        return pictureService.listAllMotionPictures();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MotionPicture> getByid (@PathVariable int id){
        try{
            MotionPicture pic = pictureService.getMotionPicture(id);
            return new ResponseEntity<MotionPicture>(pic, HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void addNewMovie(@RequestBody MotionPicture pic){
        pictureService.voidSaveNew(pic);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        pictureService.deleteMotionPicture(id);
    }

}
