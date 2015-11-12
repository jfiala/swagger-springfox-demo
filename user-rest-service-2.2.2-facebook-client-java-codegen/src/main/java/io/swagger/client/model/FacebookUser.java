package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Location;
import java.util.*;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T12:51:40.668+01:00")
public class FacebookUser   {
  
 // TODO: @Min(value= 1.0)
 // TODO: @Max(value= 9.223372036854776E18)
  private Long id = null;


  private Location location = null;


  private String name = null;


  private String about = null;


  private String ageRange = null;


  private String bio = null;


  private String birthday = null;


  private String context = null;


  private String currency = null;


  private String devices = null;


  private String education = null;


  private String email = null;


  private String favoriteAthletes = null;


  private String favoriteTeams = null;


  private String firstName = null;


  private String gender = null;


  private String hometown = null;


  private String inspirationalPeople = null;


  private String installType = null;


  private Boolean installed = null;


  private List<String> interestedIn = new ArrayList<String>();


  private Boolean isVerified = null;


  private String languages = null;


  private String lastName = null;


  private String link = null;


  private String locale = null;


  private List<String> meetingFor = new ArrayList<String>();


  private String middleName = null;


  private String nameFormat = null;


  private String paymentPricepoints = null;


  private Integer testGroup = null;


  private String political = null;


  private String relationshipStatus = null;


  private String religion = null;


  private String securitySettings = null;


  private String significantOther = null;


  private String sports = null;


  private String quotes = null;


  private String thirdPartyId = null;
 // TODO: @Min(value= -24.0)
 // TODO: @Max(value= 24.0)
  private Float timezone = null;


  private String tokenForBusiness = null;


  private String updatedTime = null;


  private Boolean verified = null;


  private String videoUploadLimits = null;


  private Boolean viewerCanSendGift = null;


  private String website = null;


  private String work = null;


  private String publicKey = null;


  private String cover = null;

  
  /**
   * minimum: 1.0
   * maximum: 9.223372036854776E18
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("location")
  
  public Location getLocation() {
    return location;
  }
  public void setLocation(Location location) {
    this.location = location;
  }

  
  /**
   * ...
   **/
  @ApiModelProperty(required = true, value = "...")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The About Me section of this person's profile, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The About Me section of this person's profile, Facebook datatype: string")
  @JsonProperty("about")
  
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }

  
  /**
   * The age segment for this person expressed as a minimum and maximum age. For example, more than 18, less than 21., Facebook datatype: agerange
   **/
  @ApiModelProperty(value = "The age segment for this person expressed as a minimum and maximum age. For example, more than 18, less than 21., Facebook datatype: agerange")
  @JsonProperty("age_range")
  
  public String getAgeRange() {
    return ageRange;
  }
  public void setAgeRange(String ageRange) {
    this.ageRange = ageRange;
  }

  
  /**
   * The person's bio, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The person's bio, Facebook datatype: string")
  @JsonProperty("bio")
  
  public String getBio() {
    return bio;
  }
  public void setBio(String bio) {
    this.bio = bio;
  }

  
  /**
   * The person's birthday.  This is a fixed format string, like `MM/DD/YYYY`.  However, people can control who can see the year they were born separately from the month and day so this string can be only the year (YYYY) or the month + day (MM/DD), Facebook datatype: string
   **/
  @ApiModelProperty(value = "The person's birthday.  This is a fixed format string, like `MM/DD/YYYY`.  However, people can control who can see the year they were born separately from the month and day so this string can be only the year (YYYY) or the month + day (MM/DD), Facebook datatype: string")
  @JsonProperty("birthday")
  
  public String getBirthday() {
    return birthday;
  }
  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  
  /**
   * Social context for this person, Facebook datatype: usercontext
   **/
  @ApiModelProperty(value = "Social context for this person, Facebook datatype: usercontext")
  @JsonProperty("context")
  
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
  }

  
  /**
   * The person's local currency information, Facebook datatype: currency
   **/
  @ApiModelProperty(value = "The person's local currency information, Facebook datatype: currency")
  @JsonProperty("currency")
  
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   * The list of devices the person is using. This will return only iOS and Android devices, Facebook datatype: list<userdevice>
   **/
  @ApiModelProperty(value = "The list of devices the person is using. This will return only iOS and Android devices, Facebook datatype: list<userdevice>")
  @JsonProperty("devices")
  
  public String getDevices() {
    return devices;
  }
  public void setDevices(String devices) {
    this.devices = devices;
  }

  
  /**
   * The person's education, Facebook datatype: list<educationexperience>
   **/
  @ApiModelProperty(value = "The person's education, Facebook datatype: list<educationexperience>")
  @JsonProperty("education")
  
  public String getEducation() {
    return education;
  }
  public void setEducation(String education) {
    this.education = education;
  }

  
  /**
   * The person's primary email address listed on their profile. This field will not be returned if no valid email address is available, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The person's primary email address listed on their profile. This field will not be returned if no valid email address is available, Facebook datatype: string")
  @JsonProperty("email")
  
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Athletes the person likes, Facebook datatype: list<experience>
   **/
  @ApiModelProperty(value = "Athletes the person likes, Facebook datatype: list<experience>")
  @JsonProperty("favorite_athletes")
  
  public String getFavoriteAthletes() {
    return favoriteAthletes;
  }
  public void setFavoriteAthletes(String favoriteAthletes) {
    this.favoriteAthletes = favoriteAthletes;
  }

  
  /**
   * Sports teams the person likes, Facebook datatype: list<experience>
   **/
  @ApiModelProperty(value = "Sports teams the person likes, Facebook datatype: list<experience>")
  @JsonProperty("favorite_teams")
  
  public String getFavoriteTeams() {
    return favoriteTeams;
  }
  public void setFavoriteTeams(String favoriteTeams) {
    this.favoriteTeams = favoriteTeams;
  }

  
  /**
   * The person's first name, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The person's first name, Facebook datatype: string")
  @JsonProperty("first_name")
  
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * The gender selected by this person, `male` or `female`. This value will be omitted if the gender is set to a custom value, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The gender selected by this person, `male` or `female`. This value will be omitted if the gender is set to a custom value, Facebook datatype: string")
  @JsonProperty("gender")
  
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  
  /**
   * The person's hometown, Facebook datatype: page
   **/
  @ApiModelProperty(value = "The person's hometown, Facebook datatype: page")
  @JsonProperty("hometown")
  
  public String getHometown() {
    return hometown;
  }
  public void setHometown(String hometown) {
    this.hometown = hometown;
  }

  
  /**
   * The person's inspirational people, Facebook datatype: list<experience>
   **/
  @ApiModelProperty(value = "The person's inspirational people, Facebook datatype: list<experience>")
  @JsonProperty("inspirational_people")
  
  public String getInspirationalPeople() {
    return inspirationalPeople;
  }
  public void setInspirationalPeople(String inspirationalPeople) {
    this.inspirationalPeople = inspirationalPeople;
  }

  
  /**
   * Install type, Facebook datatype: enum
   **/
  @ApiModelProperty(value = "Install type, Facebook datatype: enum")
  @JsonProperty("install_type")
  
  public String getInstallType() {
    return installType;
  }
  public void setInstallType(String installType) {
    this.installType = installType;
  }

  
  /**
   * Is the app making the request installed?, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "Is the app making the request installed?, Facebook datatype: bool")
  @JsonProperty("installed")
  
  public Boolean getInstalled() {
    return installed;
  }
  public void setInstalled(Boolean installed) {
    this.installed = installed;
  }

  
  /**
   * Genders the person is interested in, Facebook datatype: list<string>
   **/
  @ApiModelProperty(value = "Genders the person is interested in, Facebook datatype: list<string>")
  @JsonProperty("interested_in")
  
  public List<String> getInterestedIn() {
    return interestedIn;
  }
  public void setInterestedIn(List<String> interestedIn) {
    this.interestedIn = interestedIn;
  }

  
  /**
   * People with large numbers of followers can have the authenticity of their identity [manually verified by Facebook](https://www.facebook.com/help/196050490547892). This field indicates whether the person's profile is verified in this way. This is distinct from the `verified` field, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "People with large numbers of followers can have the authenticity of their identity [manually verified by Facebook](https://www.facebook.com/help/196050490547892). This field indicates whether the person's profile is verified in this way. This is distinct from the `verified` field, Facebook datatype: bool")
  @JsonProperty("is_verified")
  
  public Boolean getIsVerified() {
    return isVerified;
  }
  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }

  
  /**
   * Facebook Pages representing the languages this person knows, Facebook datatype: list<experience>
   **/
  @ApiModelProperty(value = "Facebook Pages representing the languages this person knows, Facebook datatype: list<experience>")
  @JsonProperty("languages")
  
  public String getLanguages() {
    return languages;
  }
  public void setLanguages(String languages) {
    this.languages = languages;
  }

  
  /**
   * The person's last name, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The person's last name, Facebook datatype: string")
  @JsonProperty("last_name")
  
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * A link to the person's Timeline, Facebook datatype: string
   **/
  @ApiModelProperty(value = "A link to the person's Timeline, Facebook datatype: string")
  @JsonProperty("link")
  
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  
  /**
   * The person's locale, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The person's locale, Facebook datatype: string")
  @JsonProperty("locale")
  
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   * What the person is interested in meeting for, Facebook datatype: list<string>
   **/
  @ApiModelProperty(value = "What the person is interested in meeting for, Facebook datatype: list<string>")
  @JsonProperty("meeting_for")
  
  public List<String> getMeetingFor() {
    return meetingFor;
  }
  public void setMeetingFor(List<String> meetingFor) {
    this.meetingFor = meetingFor;
  }

  
  /**
   * The person's middle name, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The person's middle name, Facebook datatype: string")
  @JsonProperty("middle_name")
  
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  
  /**
   * The person's name formatted to correctly handle Chinese, Japanese, or Korean ordering, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The person's name formatted to correctly handle Chinese, Japanese, or Korean ordering, Facebook datatype: string")
  @JsonProperty("name_format")
  
  public String getNameFormat() {
    return nameFormat;
  }
  public void setNameFormat(String nameFormat) {
    this.nameFormat = nameFormat;
  }

  
  /**
   * The person's payment pricepoints, Facebook datatype: paymentpricepoints
   **/
  @ApiModelProperty(value = "The person's payment pricepoints, Facebook datatype: paymentpricepoints")
  @JsonProperty("payment_pricepoints")
  
  public String getPaymentPricepoints() {
    return paymentPricepoints;
  }
  public void setPaymentPricepoints(String paymentPricepoints) {
    this.paymentPricepoints = paymentPricepoints;
  }

  
  /**
   * Platform test group, Facebook datatype: unsigned int32
   **/
  @ApiModelProperty(value = "Platform test group, Facebook datatype: unsigned int32")
  @JsonProperty("test_group")
  
  public Integer getTestGroup() {
    return testGroup;
  }
  public void setTestGroup(Integer testGroup) {
    this.testGroup = testGroup;
  }

  
  /**
   * The person's political views, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The person's political views, Facebook datatype: string")
  @JsonProperty("political")
  
  public String getPolitical() {
    return political;
  }
  public void setPolitical(String political) {
    this.political = political;
  }

  
  /**
   * The person's relationship status, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The person's relationship status, Facebook datatype: string")
  @JsonProperty("relationship_status")
  
  public String getRelationshipStatus() {
    return relationshipStatus;
  }
  public void setRelationshipStatus(String relationshipStatus) {
    this.relationshipStatus = relationshipStatus;
  }

  
  /**
   * The person's religion, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The person's religion, Facebook datatype: string")
  @JsonProperty("religion")
  
  public String getReligion() {
    return religion;
  }
  public void setReligion(String religion) {
    this.religion = religion;
  }

  
  /**
   * Security settings, Facebook datatype: securitysettings
   **/
  @ApiModelProperty(value = "Security settings, Facebook datatype: securitysettings")
  @JsonProperty("security_settings")
  
  public String getSecuritySettings() {
    return securitySettings;
  }
  public void setSecuritySettings(String securitySettings) {
    this.securitySettings = securitySettings;
  }

  
  /**
   * The person's significant other, Facebook datatype: user
   **/
  @ApiModelProperty(value = "The person's significant other, Facebook datatype: user")
  @JsonProperty("significant_other")
  
  public String getSignificantOther() {
    return significantOther;
  }
  public void setSignificantOther(String significantOther) {
    this.significantOther = significantOther;
  }

  
  /**
   * Sports this person likes, Facebook datatype: list<experience>
   **/
  @ApiModelProperty(value = "Sports this person likes, Facebook datatype: list<experience>")
  @JsonProperty("sports")
  
  public String getSports() {
    return sports;
  }
  public void setSports(String sports) {
    this.sports = sports;
  }

  
  /**
   * The person's favorite quotes, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The person's favorite quotes, Facebook datatype: string")
  @JsonProperty("quotes")
  
  public String getQuotes() {
    return quotes;
  }
  public void setQuotes(String quotes) {
    this.quotes = quotes;
  }

  
  /**
   * A string containing an anonymous, but unique identifier for the person. You can use this identifier with third parties, Facebook datatype: string
   **/
  @ApiModelProperty(value = "A string containing an anonymous, but unique identifier for the person. You can use this identifier with third parties, Facebook datatype: string")
  @JsonProperty("third_party_id")
  
  public String getThirdPartyId() {
    return thirdPartyId;
  }
  public void setThirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
  }

  
  /**
   * The person's current timezone offset from UTC, Facebook datatype: float (min: -24) (max: 24)
   * minimum: -24.0
   * maximum: 24.0
   **/
  @ApiModelProperty(value = "The person's current timezone offset from UTC, Facebook datatype: float (min: -24) (max: 24)")
  @JsonProperty("timezone")
  
  public Float getTimezone() {
    return timezone;
  }
  public void setTimezone(Float timezone) {
    this.timezone = timezone;
  }

  
  /**
   * A token that is the same across a business's apps. Access to this token requires that the person be logged into your app. This token will change if the business owning the app changes, Facebook datatype: string
   **/
  @ApiModelProperty(value = "A token that is the same across a business's apps. Access to this token requires that the person be logged into your app. This token will change if the business owning the app changes, Facebook datatype: string")
  @JsonProperty("token_for_business")
  
  public String getTokenForBusiness() {
    return tokenForBusiness;
  }
  public void setTokenForBusiness(String tokenForBusiness) {
    this.tokenForBusiness = tokenForBusiness;
  }

  
  /**
   * Updated time, Facebook datatype: datetime
   **/
  @ApiModelProperty(value = "Updated time, Facebook datatype: datetime")
  @JsonProperty("updated_time")
  
  public String getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
  }

  
  /**
   * Indicates whether the account has been verified. This is distinct from the `is_verified` field. Someone is considered verified if they take any of the following actions:\n\n* Register for mobile\n* Confirm their account via SMS\n* Enter a valid credit card\n, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "Indicates whether the account has been verified. This is distinct from the `is_verified` field. Someone is considered verified if they take any of the following actions:\n\n* Register for mobile\n* Confirm their account via SMS\n* Enter a valid credit card\n, Facebook datatype: bool")
  @JsonProperty("verified")
  
  public Boolean getVerified() {
    return verified;
  }
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  
  /**
   * Video upload limits, Facebook datatype: videouploadlimits
   **/
  @ApiModelProperty(value = "Video upload limits, Facebook datatype: videouploadlimits")
  @JsonProperty("video_upload_limits")
  
  public String getVideoUploadLimits() {
    return videoUploadLimits;
  }
  public void setVideoUploadLimits(String videoUploadLimits) {
    this.videoUploadLimits = videoUploadLimits;
  }

  
  /**
   * Can the viewer send a gift to this person?, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "Can the viewer send a gift to this person?, Facebook datatype: bool")
  @JsonProperty("viewer_can_send_gift")
  
  public Boolean getViewerCanSendGift() {
    return viewerCanSendGift;
  }
  public void setViewerCanSendGift(Boolean viewerCanSendGift) {
    this.viewerCanSendGift = viewerCanSendGift;
  }

  
  /**
   * The person's website, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The person's website, Facebook datatype: string")
  @JsonProperty("website")
  
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }

  
  /**
   * Details of a person`s work experience, Facebook datatype: list<workexperience>
   **/
  @ApiModelProperty(value = "Details of a person`s work experience, Facebook datatype: list<workexperience>")
  @JsonProperty("work")
  
  public String getWork() {
    return work;
  }
  public void setWork(String work) {
    this.work = work;
  }

  
  /**
   * The person's PGP public key, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The person's PGP public key, Facebook datatype: string")
  @JsonProperty("public_key")
  
  public String getPublicKey() {
    return publicKey;
  }
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  
  /**
   * The person's cover photo, Facebook datatype: coverphoto
   **/
  @ApiModelProperty(value = "The person's cover photo, Facebook datatype: coverphoto")
  @JsonProperty("cover")
  
  public String getCover() {
    return cover;
  }
  public void setCover(String cover) {
    this.cover = cover;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookUser {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    location: ").append(StringUtil.toIndentedString(location)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    about: ").append(StringUtil.toIndentedString(about)).append("\n");
    sb.append("    ageRange: ").append(StringUtil.toIndentedString(ageRange)).append("\n");
    sb.append("    bio: ").append(StringUtil.toIndentedString(bio)).append("\n");
    sb.append("    birthday: ").append(StringUtil.toIndentedString(birthday)).append("\n");
    sb.append("    context: ").append(StringUtil.toIndentedString(context)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    devices: ").append(StringUtil.toIndentedString(devices)).append("\n");
    sb.append("    education: ").append(StringUtil.toIndentedString(education)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    favoriteAthletes: ").append(StringUtil.toIndentedString(favoriteAthletes)).append("\n");
    sb.append("    favoriteTeams: ").append(StringUtil.toIndentedString(favoriteTeams)).append("\n");
    sb.append("    firstName: ").append(StringUtil.toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(StringUtil.toIndentedString(gender)).append("\n");
    sb.append("    hometown: ").append(StringUtil.toIndentedString(hometown)).append("\n");
    sb.append("    inspirationalPeople: ").append(StringUtil.toIndentedString(inspirationalPeople)).append("\n");
    sb.append("    installType: ").append(StringUtil.toIndentedString(installType)).append("\n");
    sb.append("    installed: ").append(StringUtil.toIndentedString(installed)).append("\n");
    sb.append("    interestedIn: ").append(StringUtil.toIndentedString(interestedIn)).append("\n");
    sb.append("    isVerified: ").append(StringUtil.toIndentedString(isVerified)).append("\n");
    sb.append("    languages: ").append(StringUtil.toIndentedString(languages)).append("\n");
    sb.append("    lastName: ").append(StringUtil.toIndentedString(lastName)).append("\n");
    sb.append("    link: ").append(StringUtil.toIndentedString(link)).append("\n");
    sb.append("    locale: ").append(StringUtil.toIndentedString(locale)).append("\n");
    sb.append("    meetingFor: ").append(StringUtil.toIndentedString(meetingFor)).append("\n");
    sb.append("    middleName: ").append(StringUtil.toIndentedString(middleName)).append("\n");
    sb.append("    nameFormat: ").append(StringUtil.toIndentedString(nameFormat)).append("\n");
    sb.append("    paymentPricepoints: ").append(StringUtil.toIndentedString(paymentPricepoints)).append("\n");
    sb.append("    testGroup: ").append(StringUtil.toIndentedString(testGroup)).append("\n");
    sb.append("    political: ").append(StringUtil.toIndentedString(political)).append("\n");
    sb.append("    relationshipStatus: ").append(StringUtil.toIndentedString(relationshipStatus)).append("\n");
    sb.append("    religion: ").append(StringUtil.toIndentedString(religion)).append("\n");
    sb.append("    securitySettings: ").append(StringUtil.toIndentedString(securitySettings)).append("\n");
    sb.append("    significantOther: ").append(StringUtil.toIndentedString(significantOther)).append("\n");
    sb.append("    sports: ").append(StringUtil.toIndentedString(sports)).append("\n");
    sb.append("    quotes: ").append(StringUtil.toIndentedString(quotes)).append("\n");
    sb.append("    thirdPartyId: ").append(StringUtil.toIndentedString(thirdPartyId)).append("\n");
    sb.append("    timezone: ").append(StringUtil.toIndentedString(timezone)).append("\n");
    sb.append("    tokenForBusiness: ").append(StringUtil.toIndentedString(tokenForBusiness)).append("\n");
    sb.append("    updatedTime: ").append(StringUtil.toIndentedString(updatedTime)).append("\n");
    sb.append("    verified: ").append(StringUtil.toIndentedString(verified)).append("\n");
    sb.append("    videoUploadLimits: ").append(StringUtil.toIndentedString(videoUploadLimits)).append("\n");
    sb.append("    viewerCanSendGift: ").append(StringUtil.toIndentedString(viewerCanSendGift)).append("\n");
    sb.append("    website: ").append(StringUtil.toIndentedString(website)).append("\n");
    sb.append("    work: ").append(StringUtil.toIndentedString(work)).append("\n");
    sb.append("    publicKey: ").append(StringUtil.toIndentedString(publicKey)).append("\n");
    sb.append("    cover: ").append(StringUtil.toIndentedString(cover)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
