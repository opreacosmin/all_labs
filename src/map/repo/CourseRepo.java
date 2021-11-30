package map.repo;

import map.domain.Course;
import map.exceptions.NullValueException;

import java.io.IOException;

/**
 * Repository Class that manages all CRUD operations for a Course object
 */
public class CourseRepo extends InMemoryRepo<Course> {
    public CourseRepo() {
        super();
    }
    @Override
    public Course findOne(Long id) throws NullValueException {
        if (id == null)
            throw new NullValueException("Invalid ID");
        for (Course course : repoList) {
            if (course.getCourseId() == id)
                return course;
        }
        return null;
    }


    @Override
    public Course update(Course obj) throws NullValueException, IOException {
        if (obj == null)
            throw new NullValueException("Invalid course object");
        for (Course course : repoList)
            if (course.getCourseId() == obj.getCourseId()) {
                repoList.remove(course);
                repoList.add(obj);
                return null;
            }
        return obj;
    }

    @Override
    public Course delete(Long id) throws NullValueException, IOException {
        if (id == null)
            throw new NullValueException("Invalid course object");
        for (Course course : repoList)
            if (course.getCourseId() == id) {
                repoList.remove(course);
                return course;
            }
        return null;
    }


    @Override
    public Course create(Course obj) throws NullValueException, IOException {
        if (obj == null)
            throw new NullValueException("Invalid course object");
        for (Course course : repoList)
            if (course.getCourseId() == obj.getCourseId()) {
                return obj;
            }
        repoList.add(obj);
        return null;
    }


}
