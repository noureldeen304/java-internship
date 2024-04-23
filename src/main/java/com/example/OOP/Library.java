package com.example.OOP;

import java.util.*;

public class Library {
    List<Resource> resources;

    public Library() {
        this.resources = new ArrayList<>();
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    public void removeResource(Resource resource) {
        resources.remove(resource);
    }

    public void displayAllResources() {
        for (Resource resource : resources) {
            resource.displayInfo();
            System.out.println();
        }
    }

}
