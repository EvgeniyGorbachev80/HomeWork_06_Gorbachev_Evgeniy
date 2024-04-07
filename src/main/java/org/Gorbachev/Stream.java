package org.Gorbachev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> studyGroups;

    public Stream() {
        studyGroups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {
        studyGroups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studyGroups.iterator();
    }

    public int size() {
        return studyGroups.size();
    }
}
