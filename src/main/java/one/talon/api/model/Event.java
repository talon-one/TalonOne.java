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
import java.util.ArrayList;
import java.util.List;
import one.talon.api.model.ApplicationEntity;
import one.talon.api.model.Entity;
import one.talon.api.model.NewEvent;
import org.joda.time.DateTime;


/**
 * Event
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-20T15:56:59.644+02:00")
public class Event   {
  @SerializedName("effects")
  private List<List<Object>> effects = new ArrayList<List<Object>>();

  public Event effects(List<List<Object>> effects) {
    this.effects = effects;
    return this;
  }

  public Event addEffectsItem(List<Object> effectsItem) {
    this.effects.add(effectsItem);
    return this;
  }

   /**
   * An array of \"effects\" that must be applied in response to this event. Example effects include `addItemToCart` or `setDiscount`. 
   * @return effects
  **/
  @ApiModelProperty(example = "null", required = true, value = "An array of \"effects\" that must be applied in response to this event. Example effects include `addItemToCart` or `setDiscount`. ")
  public List<List<Object>> getEffects() {
    return effects;
  }

  public void setEffects(List<List<Object>> effects) {
    this.effects = effects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.effects, event.effects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    effects: ").append(toIndentedString(effects)).append("\n");
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
