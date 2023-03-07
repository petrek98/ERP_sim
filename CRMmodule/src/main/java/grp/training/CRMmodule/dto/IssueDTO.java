package grp.training.CRMmodule.dto;

import grp.training.CRMmodule.model.Customer;
import grp.training.CRMmodule.model.Issue;
import grp.training.CRMmodule.model.IssueStatus;

import java.time.LocalDateTime;

public class IssueDTO {
    private Integer issueId;
    private LocalDateTime issueDate;
    private String description;
    private String solution;
    private IssueStatus status;
    private LocalDateTime lastEditDate;
    private CustomerDTO customerDTO;

    public IssueDTO() {
    }

    public IssueDTO(Integer issueId, LocalDateTime issueDate, String description, String solution, IssueStatus status, LocalDateTime lastEditDate, CustomerDTO customerDTO) {
        this.issueId = issueId;
        this.issueDate = issueDate;
        this.description = description;
        this.solution = solution;
        this.status = status;
        this.lastEditDate = lastEditDate;
        this.customerDTO = customerDTO;
    }

    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public IssueStatus getStatus() {
        return status;
    }

    public void setStatus(IssueStatus status) {
        this.status = status;
    }

    public LocalDateTime getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(LocalDateTime lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public static IssueDTO prepareDTO(Issue issueEntity) {
        return new IssueDTO();
    }

    public static Issue prepareEntity(IssueDTO issueDTO) {
        return new Issue();
    }
}
