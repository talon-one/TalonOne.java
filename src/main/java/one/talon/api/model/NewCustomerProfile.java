/**
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package one.talon.api.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import one.talon.api.model.PaymentProfile;
import org.joda.time.DateTime;


/**
 * NewCustomerProfile
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-20T15:56:59.644+02:00")
public class NewCustomerProfile   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("advocateId")
  private String advocateId = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("birthDate")
  private DateTime birthDate = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone1")
  private String phone1 = null;

  @SerializedName("phone2")
  private String phone2 = null;

  @SerializedName("fax")
  private String fax = null;

  @SerializedName("url1")
  private String url1 = null;

  @SerializedName("url2")
  private String url2 = null;

  @SerializedName("url3")
  private String url3 = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("signupDate")
  private DateTime signupDate = null;

  @SerializedName("attributes")
  private Object attributes = null;

  public NewCustomerProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this new customer profile.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name for this new customer profile.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewCustomerProfile advocateId(String advocateId) {
    this.advocateId = advocateId;
    return this;
  }

   /**
   * The identifier of the referring user, if any.
   * @return advocateId
  **/
  @ApiModelProperty(example = "null", value = "The identifier of the referring user, if any.")
  public String getAdvocateId() {
    return advocateId;
  }

  public void setAdvocateId(String advocateId) {
    this.advocateId = advocateId;
  }

  public NewCustomerProfile gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public NewCustomerProfile birthDate(DateTime birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Get birthDate
   * @return birthDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(DateTime birthDate) {
    this.birthDate = birthDate;
  }

  public NewCustomerProfile email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public NewCustomerProfile phone1(String phone1) {
    this.phone1 = phone1;
    return this;
  }

   /**
   * Get phone1
   * @return phone1
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhone1() {
    return phone1;
  }

  public void setPhone1(String phone1) {
    this.phone1 = phone1;
  }

  public NewCustomerProfile phone2(String phone2) {
    this.phone2 = phone2;
    return this;
  }

   /**
   * Get phone2
   * @return phone2
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhone2() {
    return phone2;
  }

  public void setPhone2(String phone2) {
    this.phone2 = phone2;
  }

  public NewCustomerProfile fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public NewCustomerProfile url1(String url1) {
    this.url1 = url1;
    return this;
  }

   /**
   * Get url1
   * @return url1
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrl1() {
    return url1;
  }

  public void setUrl1(String url1) {
    this.url1 = url1;
  }

  public NewCustomerProfile url2(String url2) {
    this.url2 = url2;
    return this;
  }

   /**
   * Get url2
   * @return url2
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrl2() {
    return url2;
  }

  public void setUrl2(String url2) {
    this.url2 = url2;
  }

  public NewCustomerProfile url3(String url3) {
    this.url3 = url3;
    return this;
  }

   /**
   * Get url3
   * @return url3
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrl3() {
    return url3;
  }

  public void setUrl3(String url3) {
    this.url3 = url3;
  }

  public NewCustomerProfile language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public NewCustomerProfile locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public NewCustomerProfile signupDate(DateTime signupDate) {
    this.signupDate = signupDate;
    return this;
  }

   /**
   * Get signupDate
   * @return signupDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getSignupDate() {
    return signupDate;
  }

  public void setSignupDate(DateTime signupDate) {
    this.signupDate = signupDate;
  }

  public NewCustomerProfile attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this item
   * @return attributes
  **/
  @ApiModelProperty(example = "null", value = "Arbitrary properties associated with this item")
  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCustomerProfile newCustomerProfile = (NewCustomerProfile) o;
    return Objects.equals(this.name, newCustomerProfile.name) &&
        Objects.equals(this.advocateId, newCustomerProfile.advocateId) &&
        Objects.equals(this.gender, newCustomerProfile.gender) &&
        Objects.equals(this.birthDate, newCustomerProfile.birthDate) &&
        Objects.equals(this.email, newCustomerProfile.email) &&
        Objects.equals(this.phone1, newCustomerProfile.phone1) &&
        Objects.equals(this.phone2, newCustomerProfile.phone2) &&
        Objects.equals(this.fax, newCustomerProfile.fax) &&
        Objects.equals(this.url1, newCustomerProfile.url1) &&
        Objects.equals(this.url2, newCustomerProfile.url2) &&
        Objects.equals(this.url3, newCustomerProfile.url3) &&
        Objects.equals(this.language, newCustomerProfile.language) &&
        Objects.equals(this.locale, newCustomerProfile.locale) &&
        Objects.equals(this.signupDate, newCustomerProfile.signupDate) &&
        Objects.equals(this.attributes, newCustomerProfile.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, advocateId, gender, birthDate, email, phone1, phone2, fax, url1, url2, url3, language, locale, signupDate, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCustomerProfile {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    advocateId: ").append(toIndentedString(advocateId)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone1: ").append(toIndentedString(phone1)).append("\n");
    sb.append("    phone2: ").append(toIndentedString(phone2)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    url1: ").append(toIndentedString(url1)).append("\n");
    sb.append("    url2: ").append(toIndentedString(url2)).append("\n");
    sb.append("    url3: ").append(toIndentedString(url3)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    signupDate: ").append(toIndentedString(signupDate)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

