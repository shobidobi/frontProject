//package entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "detail_user", schema = "public", catalog = "login")
//public class DetailUserEntity {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id")
//    private int id;
//    @Basic
//    @Column(name = "user_id")
//    private int userId;
//    @Basic
//    @Column(name = "score")
//    private int score;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//
//    public int getScore() {
//        return score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        DetailUserEntity that = (DetailUserEntity) o;
//        return id == that.id && userId == that.userId && score == that.score;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, userId, score);
//    }
//}
