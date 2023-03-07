package grp.training.CRMmodule.dto;

import grp.training.CRMmodule.model.Customer;
import java.util.List;

public class CustomerDTO {
    private Integer customerId;
    private String firstName;
    private String lastName;
    private String phoneNo;
    private String email;
    private List<IssueDTO> issueDTOS;

    public CustomerDTO(Integer customerId, String firstName, String lastName, String phoneNo, String email, List<IssueDTO> issueDTOS) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.email = email;
        this.issueDTOS = issueDTOS;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<IssueDTO> getIssueDTOS() {
        return issueDTOS;
    }

    public void setIssueDTOS(List<IssueDTO> issueDTOS) {
        this.issueDTOS = issueDTOS;
    }

    static public CustomerDTO prepareDTO(Customer customerEntity) {
        return new CustomerDTO(customerEntity.getCustomerId(),
                customerEntity.getFirstName(),
                customerEntity.getLastName(),
                customerEntity.getPhoneNo(),
                customerEntity.getEmail(),
                null);
    }

    static public Customer prepareEntity(CustomerDTO customerDTO) {
        return new Customer(customerDTO.getCustomerId(),
                customerDTO.getFirstName(),
                customerDTO.getLastName(),
                customerDTO.getPhoneNo(),
                customerDTO.getEmail(),
                null);
    }
}
