package main.controller;

import java.util.ArrayList;
import java.util.List;
import main.model.PhoneContact;
import main.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {

  @Autowired
  private ContactRepository repository;

  @GetMapping ("/get_phone_contact")
  public List<PhoneContact> getPhoneContact () {
    List<PhoneContact> list = new ArrayList<>();
    repository.findAll().forEach(list::add);
    return list;
  }


  @PostMapping ("/add_phone")
  public void add (@RequestBody PhoneContact contact)
  {
    repository.save(contact);
  }

}
