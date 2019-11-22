package com.training;

public class ClassRoom {

  private String meetingRoomName;

  private String meetingRoomSeq;

  private int floorNo;

  public ClassRoom() {
  }

  public ClassRoom(String meetingRoomName, String meetingRoomSeq, int floorNo) {
    super();
    this.meetingRoomName = meetingRoomName;
    this.meetingRoomSeq = meetingRoomSeq;
    this.floorNo = floorNo;
  }

  public String getMeetingRoomName() {
	  System.out.println("Nitin");
    return meetingRoomName;
  }

  public void setMeetingRoomName(String meetingRoomName) {
    this.meetingRoomName = meetingRoomName;
  }

  public String getMeetingRoomSeq() {
    return meetingRoomSeq;
  }

  public void setMeetingRoomSeq(String meetingRoomSeq) {
    this.meetingRoomSeq = meetingRoomSeq;
  }

  public int getFloorNo() {
    return floorNo;
  }

  public void setFloorNo(int floorNo) {
    this.floorNo = floorNo;
  }

  @Override
  public String toString() {
    return "ClassRoom [meetingRoomName=" + meetingRoomName + ", meetingRoomSeq=" + meetingRoomSeq + ", floorNo="
        + floorNo + "]";
  }

}