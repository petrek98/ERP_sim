package grp.training.CRMmodule.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "issue")
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer issueId;
    private LocalDateTime issueDate;
    @Column(name = "issue_description")
    private String description;
    @Column(name = "issue_solution")
    private String solution;
    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus status;
    @Column(name = "issue_edit_date")
    private LocalDateTime lastEditDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Issue() {
    }

    public Issue(Integer issueId, LocalDateTime issueDate, String description, String solution, IssueStatus status, LocalDateTime lastEditDate, Customer customer) {
        this.issueId = issueId;
        this.issueDate = issueDate;
        this.description = description;
        this.solution = solution;
        this.status = status;
        this.lastEditDate = lastEditDate;
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Issue issue = (Issue) o;
        return Objects.equals(issueId, issue.issueId) && Objects.equals(issueDate, issue.issueDate) && Objects.equals(description, issue.description) && Objects.equals(solution, issue.solution) && status == issue.status && Objects.equals(lastEditDate, issue.lastEditDate) && Objects.equals(customer, issue.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueId, issueDate, description, solution, status, lastEditDate, customer);
    }
}
