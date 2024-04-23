package com.example.OOP;

import java.util.*;

public class Library {
    private List<Resource> resources;
    private static Integer idGenerator = 0;

    public Library() {
        this.resources = new ArrayList<>();
    }

    public void addResource(Resource resource) {
        idGenerator++;
        resource.setId(idGenerator);
        resources.add(resource);
    }

    public void removeResource(Integer id) {
        resources.removeIf((res) -> res.getId() == id);
    }

    public void updateResource(Integer id, Resource resource) {
        for (Resource res : resources) {
            if (res.getId() == id) {
                int index = resources.indexOf(res);
                resource.setId(id);
                resources.set(index, resource);
                break;
            }
        }
    }

    public void displayAllResources() {
        for (Resource resource : resources) {
            resource.displayInfo();
            System.out.println();
        }
    }

}
