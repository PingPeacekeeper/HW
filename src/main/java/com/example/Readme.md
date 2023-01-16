| URL                               | input   | output            |
| --------------------------------- | ------- | ----------------- |
| GET /teacher/getAll               | /       | TeacherDTO        |
| GET /teacher/{id}                 | TID     | TeacherDTO        |
| DELETE /teacher/{id}              | TID     | Boolean success   |
| POST /teacher                     | Teacher | TeacherDTO        |
| PUT /teacher                      | Teacher | TeacherDTO        |
|                                   |         |                   |
| GET /student/getAll               | /       | StudentDTO        |
| GET /student/{id}                 | SID     | StudentDTO        |
| DELETE /student/{id}              | SID     | Boolean success   |
| POST /student                     | student | StudentDTO        |
| PUT /student                      | student | StudentDTO        |
|                                   |         |                   |
| GET /getTeacherByStudentID/{id}   | SID     | TeacherStudentDTO |
| GET /getTeacherByTeacherID/{id}   | TID     | TeacherStudentDTO |
| GET /getTeacherByBoth/SID=?&TID=? | SID,TID | TeacherStudentDTO |

