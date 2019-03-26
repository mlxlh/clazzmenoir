package com.suse.hl.clazzmenoir.common.domain;

public class Student {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.id
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.name
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sex
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.s_birthday
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    private String sBirthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.class_id
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    private String classId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.t_id
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    private String tId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    public Student(String id, String name, String sex, String sBirthday, String classId, String tId) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.sBirthday = sBirthday;
        this.classId = classId;
        this.tId = tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    public Student() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.id
     *
     * @return the value of student.id
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.id
     *
     * @param id the value for student.id
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.name
     *
     * @return the value of student.name
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.name
     *
     * @param name the value for student.name
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sex
     *
     * @return the value of student.sex
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sex
     *
     * @param sex the value for student.sex
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.s_birthday
     *
     * @return the value of student.s_birthday
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    public String getsBirthday() {
        return sBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.s_birthday
     *
     * @param sBirthday the value for student.s_birthday
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    public void setsBirthday(String sBirthday) {
        this.sBirthday = sBirthday == null ? null : sBirthday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.class_id
     *
     * @return the value of student.class_id
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    public String getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.class_id
     *
     * @param classId the value for student.class_id
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.t_id
     *
     * @return the value of student.t_id
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    public String gettId() {
        return tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.t_id
     *
     * @param tId the value for student.t_id
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Student other = (Student) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getsBirthday() == null ? other.getsBirthday() == null : this.getsBirthday().equals(other.getsBirthday()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.gettId() == null ? other.gettId() == null : this.gettId().equals(other.gettId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Mar 24 14:34:07 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getsBirthday() == null) ? 0 : getsBirthday().hashCode());
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        result = prime * result + ((gettId() == null) ? 0 : gettId().hashCode());
        return result;
    }
}