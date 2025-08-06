package com.yashwardhan.journalApp.repository;

import com.yashwardhan.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

//MongoRepository<Entity or collection or POJO, Data type of ID>
public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}

