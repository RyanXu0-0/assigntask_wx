package com.nju.assigntask.entity;

import java.io.Serializable;

public class Release implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.releaseId
     *
     * @mbg.generated
     */
    private Integer releaseid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.userId
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.releaseName
     *
     * @mbg.generated
     */
    private String releasename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.plan
     *
     * @mbg.generated
     */
    private String plan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.algNames
     *
     * @mbg.generated
     */
    private String algnames;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.ifDivided
     *
     * @mbg.generated
     */
    private String ifdivided;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.ifComplete
     *
     * @mbg.generated
     */
    private String ifcomplete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.winAlgname
     *
     * @mbg.generated
     */
    private String winalgname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.result
     *
     * @mbg.generated
     */
    private String result;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table release
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.releaseId
     *
     * @return the value of release.releaseId
     *
     * @mbg.generated
     */
    public Integer getReleaseid() {
        return releaseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.releaseId
     *
     * @param releaseid the value for release.releaseId
     *
     * @mbg.generated
     */
    public void setReleaseid(Integer releaseid) {
        this.releaseid = releaseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.userId
     *
     * @return the value of release.userId
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.userId
     *
     * @param userid the value for release.userId
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.releaseName
     *
     * @return the value of release.releaseName
     *
     * @mbg.generated
     */
    public String getReleasename() {
        return releasename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.releaseName
     *
     * @param releasename the value for release.releaseName
     *
     * @mbg.generated
     */
    public void setReleasename(String releasename) {
        this.releasename = releasename == null ? null : releasename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.plan
     *
     * @return the value of release.plan
     *
     * @mbg.generated
     */
    public String getPlan() {
        return plan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.plan
     *
     * @param plan the value for release.plan
     *
     * @mbg.generated
     */
    public void setPlan(String plan) {
        this.plan = plan == null ? null : plan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.algNames
     *
     * @return the value of release.algNames
     *
     * @mbg.generated
     */
    public String getAlgnames() {
        return algnames;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.algNames
     *
     * @param algnames the value for release.algNames
     *
     * @mbg.generated
     */
    public void setAlgnames(String algnames) {
        this.algnames = algnames == null ? null : algnames.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.ifDivided
     *
     * @return the value of release.ifDivided
     *
     * @mbg.generated
     */
    public String getIfdivided() {
        return ifdivided;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.ifDivided
     *
     * @param ifdivided the value for release.ifDivided
     *
     * @mbg.generated
     */
    public void setIfdivided(String ifdivided) {
        this.ifdivided = ifdivided == null ? null : ifdivided.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.ifComplete
     *
     * @return the value of release.ifComplete
     *
     * @mbg.generated
     */
    public String getIfcomplete() {
        return ifcomplete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.ifComplete
     *
     * @param ifcomplete the value for release.ifComplete
     *
     * @mbg.generated
     */
    public void setIfcomplete(String ifcomplete) {
        this.ifcomplete = ifcomplete == null ? null : ifcomplete.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.winAlgname
     *
     * @return the value of release.winAlgname
     *
     * @mbg.generated
     */
    public String getWinalgname() {
        return winalgname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.winAlgname
     *
     * @param winalgname the value for release.winAlgname
     *
     * @mbg.generated
     */
    public void setWinalgname(String winalgname) {
        this.winalgname = winalgname == null ? null : winalgname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.result
     *
     * @return the value of release.result
     *
     * @mbg.generated
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.result
     *
     * @param result the value for release.result
     *
     * @mbg.generated
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.status
     *
     * @return the value of release.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.status
     *
     * @param status the value for release.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", releaseid=").append(releaseid);
        sb.append(", userid=").append(userid);
        sb.append(", releasename=").append(releasename);
        sb.append(", plan=").append(plan);
        sb.append(", algnames=").append(algnames);
        sb.append(", ifdivided=").append(ifdivided);
        sb.append(", ifcomplete=").append(ifcomplete);
        sb.append(", winalgname=").append(winalgname);
        sb.append(", result=").append(result);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}