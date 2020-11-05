package com.example.logindemo2;

import com.google.android.gms.tasks.Task;

import org.bson.types.ObjectId;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import io.realm.annotations.Required;

public class MongoTask extends RealmObject {
    @PrimaryKey
    private ObjectId _id = new ObjectId();
    private String name = "MongoTask";

    @Required
    private String status = TaskStatus.Open.name();

    public void setStatus(TaskStatus status) {
        this.status = status.name();
    }

    public String getStatus() {
        return this.status;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MongoTask(String _name) {
        this.name = _name;
    }

    public MongoTask() {}
}