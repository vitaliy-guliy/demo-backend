package com.redhat.demo.webback.service;

import com.redhat.demo.webback.models.MotionPicture;
import com.redhat.demo.webback.repos.MotionPictureRepo;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PictureService {
    private MotionPictureRepo repo;

    public List<MotionPicture> listAllMotionPictures(){
        return repo.findAll();
    }

    public void voidSaveNew(MotionPicture motionPicture){
        repo.save(motionPicture);
    }

    public MotionPicture getMotionPicture(int id){
        return repo.findById(id).get();
    }

    public void deleteMotionPicture(int id){
        repo.deleteById(id);
    }

}
