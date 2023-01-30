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

    @GetMapping("/get/{id}")
    public ResponseEntity<MotionPicture> getByid (@PathVariable int id){
        try{
            MotionPicture pic = pictureService.getMotionPicture(id);
            return new ResponseEntity<MotionPicture>(pic, HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addNew")
    public void addNewMovie(@RequestBody MotionPicture pic){
        System.out.println(pic.getId());
        System.out.println(pic.getName());
        System.out.println(pic.getYear());
        System.out.println(pic.getImageUrl());
        System.out.println(pic.getGenre());
        System.out.println(pic.getRank());
        System.out.println(pic.isTVShow());
        pictureService.saveNew(pic);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        pictureService.deleteMotionPicture(id);
    }

}
