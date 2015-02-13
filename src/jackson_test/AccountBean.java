package jackson_test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountBean {
    private int id;
    private String name;
    private String email;
    @JsonProperty(value = "Address")
    private String Address;
    private Birthday birthday;
    
    
    //getter、setter
    @JsonProperty
    public String getAddress() {
		return Address;
	}

    @JsonProperty
	public void setAddress(String address) {
		Address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}



	public Birthday getBirthday() {
		return birthday;
	}


	public void setBirthday(Birthday birthday) {
		this.birthday = birthday;
	}


	@Override
    public String toString() {
        return this.name + "#" + this.id + "#" + this.Address + "#" + this.birthday + "#" + this.email;
    }
}
