package com.project.ownote.annual.dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AnnualPage {
    private int total;
    private int currentPage;
    private List<AnnualDto> content;
    private int totalPages;
    private int startPage;
    private int endPage;


public AnnualPage(int total,int currentPage, int size, List<AnnualDto> content){
    this.total = total;
    this.currentPage= currentPage;
    this.content = content;

    if (total == 0) {
        totalPages = 0;
        startPage = 0;
        endPage = 0;
    } else {
        totalPages = total / size;
        if (total % size > 0) {
            totalPages++;
        }

        int modVal = currentPage % 5;
        startPage = currentPage / 5 * 5 + 1;
        if (modVal == 0) startPage -= 5;

        endPage = startPage + 4;
        if (endPage > totalPages) endPage = totalPages;
    }
}
public int getTotal(){
    return total;}


    public boolean hasNoAnnualDto() {
        return total == 0;
    }

    public boolean hasAnnualDto() {
        return total > 0;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public List<AnnualDto> getContent() {
        return content;
    }

    public int getStartPage() {
        return startPage;
    }

    public int getEndPage() {
        return endPage;
    }

}


