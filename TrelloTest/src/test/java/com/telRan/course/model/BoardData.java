package com.telRan.course.model;

public class BoardData {
    private String boardName;

//    public BoardData(String boardName) {
//        this.boardName = boardName;
//    }

    public String getBoardName() {
        return boardName;
    }

    public BoardData withBoardName(String boardName) {
        this.boardName = boardName;
        return this;
    }
}
