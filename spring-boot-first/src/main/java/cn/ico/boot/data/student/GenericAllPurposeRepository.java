package cn.ico.boot.data.student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import cn.ico.boot.entity.Passport;
import cn.ico.boot.entity.Project;
import cn.ico.boot.entity.Student;
import cn.ico.boot.entity.Task;

@Repository
@Transactional
public class GenericAllPurposeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Passport getPassport(final long id) {
        Passport passport = entityManager
                .find(Passport.class, id);
        passport.getStudent();
        return passport;
    }

    public Task createTask(Task task) {
        return entityManager.merge(task);
    }

    public Project createProject(Project project) {
        return entityManager.merge(project);
    }

    public Student createStudent(Student student) {
        return entityManager.merge(student);
    }

    public void assignStudentToProject(long studentId, long projectId) {
        Project project = entityManager.find(Project.class,
                projectId);
        Student student = entityManager.find(Student.class,
                studentId);
        project.getStudents().add(student);
    }

}