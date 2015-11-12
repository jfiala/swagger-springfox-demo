package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Location;
import java.util.*;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T16:05:10.959+01:00")
public class FacebookUser   {
  
 // TODO: @Min(value= 1.0)
 // TODO: @Max(value= 9.223372036854776E18)
  private Long id = null;


  private Location location = null;


  private String name = null;


  private String about = null;


  private String accessToken = null;


  private String adCampaign = null;


  private String affiliation = null;


  private String appId = null;


  private String appLinks = null;


  private String artistsWeLike = null;

public enum AttireEnum {
  CASUAL_("Casual,"),
  DRESSY_("Dressy,"),
  UNSPECIFIED("Unspecified");

  private String value;

  AttireEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}



  private AttireEnum attire = null;


  private String awards = null;


  private String bandInterests = null;


  private String bandMembers = null;


  private String bestPage = null;


  private String bio = null;


  private String birthday = null;


  private String bookingAgent = null;


  private String built = null;


  private String business = null;


  private Boolean canCheckin = null;


  private Boolean canPost = null;


  private String category = null;


  private String categoryList = null;


  private String companyOverview = null;


  private String contactAddress = null;


  private String context = null;


  private Integer countryPageLikes = null;


  private String cover = null;


  private String culinaryTeam = null;


  private String currentLocation = null;


  private String description = null;


  private String descriptionHtml = null;


  private String directedBy = null;


  private String displaySubtext = null;


  private List<String> emails = new ArrayList<String>();


  private String features = null;


  private List<String> foodStyles = new ArrayList<String>();


  private String founded = null;


  private String generalInfo = null;


  private String generalManager = null;


  private String genre = null;


  private String globalBrandPageName = null;


  private String globalBrandRootId = null;


  private Boolean hasAddedApp = null;


  private Boolean leadgenTosAccepted = null;


  private String hometown = null;


  private String hours = null;


  private String influences = null;


  private Boolean isCommunityPage = null;


  private Boolean isPermanentlyClosed = null;


  private Boolean isPublished = null;


  private Boolean isUnclaimed = null;


  private Boolean isVerified = null;


  private String link = null;


  private String mission = null;


  private String mpg = null;


  private String network = null;


  private Integer newLikeCount = null;


  private Boolean offerEligible = null;


  private String parentPage = null;


  private String parking = null;


  private String paymentOptions = null;


  private String personalInfo = null;


  private String personalInterests = null;


  private String pharmaSafetyInfo = null;


  private String phone = null;


  private String plotOutline = null;


  private String pressContact = null;


  private String priceRange = null;


  private String producedBy = null;


  private String products = null;


  private Boolean promotionEligible = null;


  private String promotionIneligibleReason = null;


  private String publicTransit = null;


  private String recordLabel = null;


  private String releaseDate = null;


  private String restaurantServices = null;


  private String restaurantSpecialties = null;


  private String schedule = null;


  private String screenplayBy = null;


  private String season = null;


  private String starring = null;


  private Integer storeNumber = null;


  private String studio = null;


  private Integer talkingAboutCount = null;


  private String engagement = null;


  private String singleLineAddress = null;


  private String placeType = null;


  private Integer unreadMessageCount = null;


  private Integer unreadNotifCount = null;


  private Integer unseenMessageCount = null;


  private String username = null;


  private String voipInfo = null;


  private String website = null;


  private Integer wereHereCount = null;


  private String writtenBy = null;


  private String ownerBusiness = null;


  private String lastUsedTime = null;


  private Float assetScore = null;


  private Integer checkins = null;


  private Integer likes = null;


  private String members = null;

  
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
   * Information about the Page, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Information about the Page, Facebook datatype: string")
  @JsonProperty("about")
  
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }

  
  /**
   * The access token you can use to act as the Page. Only visible to Page Admins, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The access token you can use to act as the Page. Only visible to Page Admins, Facebook datatype: string")
  @JsonProperty("access_token")
  
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  
  /**
   * The Page's currently running promotion campaign, Facebook datatype: adcampaign
   **/
  @ApiModelProperty(value = "The Page's currently running promotion campaign, Facebook datatype: adcampaign")
  @JsonProperty("ad_campaign")
  
  public String getAdCampaign() {
    return adCampaign;
  }
  public void setAdCampaign(String adCampaign) {
    this.adCampaign = adCampaign;
  }

  
  /**
   * Affiliation of this person. Applicable to Pages representing people, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Affiliation of this person. Applicable to Pages representing people, Facebook datatype: string")
  @JsonProperty("affiliation")
  
  public String getAffiliation() {
    return affiliation;
  }
  public void setAffiliation(String affiliation) {
    this.affiliation = affiliation;
  }

  
  /**
   * App ID for app-owned Pages and app Pages, Facebook datatype: id
   **/
  @ApiModelProperty(value = "App ID for app-owned Pages and app Pages, Facebook datatype: id")
  @JsonProperty("app_id")
  
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }

  
  /**
   * AppLinks data associated with the Page's URL, Facebook datatype: applinks
   **/
  @ApiModelProperty(value = "AppLinks data associated with the Page's URL, Facebook datatype: applinks")
  @JsonProperty("app_links")
  
  public String getAppLinks() {
    return appLinks;
  }
  public void setAppLinks(String appLinks) {
    this.appLinks = appLinks;
  }

  
  /**
   * Artists the band likes. Applicable to Bands, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Artists the band likes. Applicable to Bands, Facebook datatype: string")
  @JsonProperty("artists_we_like")
  
  public String getArtistsWeLike() {
    return artistsWeLike;
  }
  public void setArtistsWeLike(String artistsWeLike) {
    this.artistsWeLike = artistsWeLike;
  }

  
  /**
   * Dress code of the business. Applicable to Restaurants or Nightlife. Can be one of Casual, Dressy or Unspecified, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Dress code of the business. Applicable to Restaurants or Nightlife. Can be one of Casual, Dressy or Unspecified, Facebook datatype: string")
  @JsonProperty("attire")
  
  public AttireEnum getAttire() {
    return attire;
  }
  public void setAttire(AttireEnum attire) {
    this.attire = attire;
  }

  
  /**
   * The awards information of the film. Applicable to Films, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The awards information of the film. Applicable to Films, Facebook datatype: string")
  @JsonProperty("awards")
  
  public String getAwards() {
    return awards;
  }
  public void setAwards(String awards) {
    this.awards = awards;
  }

  
  /**
   * Band interests. Applicable to Bands, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Band interests. Applicable to Bands, Facebook datatype: string")
  @JsonProperty("band_interests")
  
  public String getBandInterests() {
    return bandInterests;
  }
  public void setBandInterests(String bandInterests) {
    this.bandInterests = bandInterests;
  }

  
  /**
   * Members of the band. Applicable to Bands, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Members of the band. Applicable to Bands, Facebook datatype: string")
  @JsonProperty("band_members")
  
  public String getBandMembers() {
    return bandMembers;
  }
  public void setBandMembers(String bandMembers) {
    this.bandMembers = bandMembers;
  }

  
  /**
   * The best available Page on Facebook for the concept represented by this Page. The best available Page takes into account authenticity and the number of likes, Facebook datatype: page
   **/
  @ApiModelProperty(value = "The best available Page on Facebook for the concept represented by this Page. The best available Page takes into account authenticity and the number of likes, Facebook datatype: page")
  @JsonProperty("best_page")
  
  public String getBestPage() {
    return bestPage;
  }
  public void setBestPage(String bestPage) {
    this.bestPage = bestPage;
  }

  
  /**
   * Biography of the band. Applicable to Bands, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Biography of the band. Applicable to Bands, Facebook datatype: string")
  @JsonProperty("bio")
  
  public String getBio() {
    return bio;
  }
  public void setBio(String bio) {
    this.bio = bio;
  }

  
  /**
   * Birthday of this person. Applicable to Pages representing people, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Birthday of this person. Applicable to Pages representing people, Facebook datatype: string")
  @JsonProperty("birthday")
  
  public String getBirthday() {
    return birthday;
  }
  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  
  /**
   * Booking agent of the band. Applicable to Bands, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Booking agent of the band. Applicable to Bands, Facebook datatype: string")
  @JsonProperty("booking_agent")
  
  public String getBookingAgent() {
    return bookingAgent;
  }
  public void setBookingAgent(String bookingAgent) {
    this.bookingAgent = bookingAgent;
  }

  
  /**
   * Year vehicle was built. Applicable to Vehicles, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Year vehicle was built. Applicable to Vehicles, Facebook datatype: string")
  @JsonProperty("built")
  
  public String getBuilt() {
    return built;
  }
  public void setBuilt(String built) {
    this.built = built;
  }

  
  /**
   * The Business associated with this Page.  Visible only with a page access token or a user access token that has admin rights on the page, Facebook datatype: null
   **/
  @ApiModelProperty(value = "The Business associated with this Page.  Visible only with a page access token or a user access token that has admin rights on the page, Facebook datatype: null")
  @JsonProperty("business")
  
  public String getBusiness() {
    return business;
  }
  public void setBusiness(String business) {
    this.business = business;
  }

  
  /**
   * Whether this page has checkin functionality enabled, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "Whether this page has checkin functionality enabled, Facebook datatype: bool")
  @JsonProperty("can_checkin")
  
  public Boolean getCanCheckin() {
    return canCheckin;
  }
  public void setCanCheckin(Boolean canCheckin) {
    this.canCheckin = canCheckin;
  }

  
  /**
   * Whether the current session user can post on this Page, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "Whether the current session user can post on this Page, Facebook datatype: bool")
  @JsonProperty("can_post")
  
  public Boolean getCanPost() {
    return canPost;
  }
  public void setCanPost(Boolean canPost) {
    this.canPost = canPost;
  }

  
  /**
   * The Page's category. e.g. Product/Service, Computers/Technology, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The Page's category. e.g. Product/Service, Computers/Technology, Facebook datatype: string")
  @JsonProperty("category")
  
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   * The Page's sub-categories, Facebook datatype: list<pagecategory>
   **/
  @ApiModelProperty(value = "The Page's sub-categories, Facebook datatype: list<pagecategory>")
  @JsonProperty("category_list")
  
  public String getCategoryList() {
    return categoryList;
  }
  public void setCategoryList(String categoryList) {
    this.categoryList = categoryList;
  }

  
  /**
   * The company overview. Applicable to Companies, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The company overview. Applicable to Companies, Facebook datatype: string")
  @JsonProperty("company_overview")
  
  public String getCompanyOverview() {
    return companyOverview;
  }
  public void setCompanyOverview(String companyOverview) {
    this.companyOverview = companyOverview;
  }

  
  /**
   * The mailing or contact address for this page. This field will be blank if the contact address is the same as the physical address, Facebook datatype: mailingaddress
   **/
  @ApiModelProperty(value = "The mailing or contact address for this page. This field will be blank if the contact address is the same as the physical address, Facebook datatype: mailingaddress")
  @JsonProperty("contact_address")
  
  public String getContactAddress() {
    return contactAddress;
  }
  public void setContactAddress(String contactAddress) {
    this.contactAddress = contactAddress;
  }

  
  /**
   * Social context for this Page, Facebook datatype: opengraphcontext
   **/
  @ApiModelProperty(value = "Social context for this Page, Facebook datatype: opengraphcontext")
  @JsonProperty("context")
  
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
  }

  
  /**
   * If this is a Page in a Global Pages hierarchy, the number of people who are being directed to this Page., Facebook datatype: unsigned int32
   **/
  @ApiModelProperty(value = "If this is a Page in a Global Pages hierarchy, the number of people who are being directed to this Page., Facebook datatype: unsigned int32")
  @JsonProperty("country_page_likes")
  
  public Integer getCountryPageLikes() {
    return countryPageLikes;
  }
  public void setCountryPageLikes(Integer countryPageLikes) {
    this.countryPageLikes = countryPageLikes;
  }

  
  /**
   * Information about the page's cover photo, Facebook datatype: coverphoto
   **/
  @ApiModelProperty(value = "Information about the page's cover photo, Facebook datatype: coverphoto")
  @JsonProperty("cover")
  
  public String getCover() {
    return cover;
  }
  public void setCover(String cover) {
    this.cover = cover;
  }

  
  /**
   * Culinary team of the business. Applicable to Restaurants or Nightlife, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Culinary team of the business. Applicable to Restaurants or Nightlife, Facebook datatype: string")
  @JsonProperty("culinary_team")
  
  public String getCulinaryTeam() {
    return culinaryTeam;
  }
  public void setCulinaryTeam(String culinaryTeam) {
    this.culinaryTeam = culinaryTeam;
  }

  
  /**
   * Current location of the Page, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Current location of the Page, Facebook datatype: string")
  @JsonProperty("current_location")
  
  public String getCurrentLocation() {
    return currentLocation;
  }
  public void setCurrentLocation(String currentLocation) {
    this.currentLocation = currentLocation;
  }

  
  /**
   * The description of the Page, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The description of the Page, Facebook datatype: string")
  @JsonProperty("description")
  
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The description of the Page in raw HTML, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The description of the Page in raw HTML, Facebook datatype: string")
  @JsonProperty("description_html")
  
  public String getDescriptionHtml() {
    return descriptionHtml;
  }
  public void setDescriptionHtml(String descriptionHtml) {
    this.descriptionHtml = descriptionHtml;
  }

  
  /**
   * The director of the film. Applicable to Films, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The director of the film. Applicable to Films, Facebook datatype: string")
  @JsonProperty("directed_by")
  
  public String getDirectedBy() {
    return directedBy;
  }
  public void setDirectedBy(String directedBy) {
    this.directedBy = directedBy;
  }

  
  /**
   * Subtext about the Page being viewed, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Subtext about the Page being viewed, Facebook datatype: string")
  @JsonProperty("display_subtext")
  
  public String getDisplaySubtext() {
    return displaySubtext;
  }
  public void setDisplaySubtext(String displaySubtext) {
    this.displaySubtext = displaySubtext;
  }

  
  /**
   * The emails listed in the About section of a Page, Facebook datatype: list<string>
   **/
  @ApiModelProperty(value = "The emails listed in the About section of a Page, Facebook datatype: list<string>")
  @JsonProperty("emails")
  
  public List<String> getEmails() {
    return emails;
  }
  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  
  /**
   * Features of the vehicle. Applicable to Vehicles, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Features of the vehicle. Applicable to Vehicles, Facebook datatype: string")
  @JsonProperty("features")
  
  public String getFeatures() {
    return features;
  }
  public void setFeatures(String features) {
    this.features = features;
  }

  
  /**
   * The restaurant's food styles. Applicable to Restaurants, Facebook datatype: list<string>
   **/
  @ApiModelProperty(value = "The restaurant's food styles. Applicable to Restaurants, Facebook datatype: list<string>")
  @JsonProperty("food_styles")
  
  public List<String> getFoodStyles() {
    return foodStyles;
  }
  public void setFoodStyles(List<String> foodStyles) {
    this.foodStyles = foodStyles;
  }

  
  /**
   * When the company was founded. Applicable to Pages in the Company category, Facebook datatype: string
   **/
  @ApiModelProperty(value = "When the company was founded. Applicable to Pages in the Company category, Facebook datatype: string")
  @JsonProperty("founded")
  
  public String getFounded() {
    return founded;
  }
  public void setFounded(String founded) {
    this.founded = founded;
  }

  
  /**
   * General information provided by the Page, Facebook datatype: string
   **/
  @ApiModelProperty(value = "General information provided by the Page, Facebook datatype: string")
  @JsonProperty("general_info")
  
  public String getGeneralInfo() {
    return generalInfo;
  }
  public void setGeneralInfo(String generalInfo) {
    this.generalInfo = generalInfo;
  }

  
  /**
   * General manager of the business. Applicable to Restaurants or Nightlife, Facebook datatype: string
   **/
  @ApiModelProperty(value = "General manager of the business. Applicable to Restaurants or Nightlife, Facebook datatype: string")
  @JsonProperty("general_manager")
  
  public String getGeneralManager() {
    return generalManager;
  }
  public void setGeneralManager(String generalManager) {
    this.generalManager = generalManager;
  }

  
  /**
   * The genre of the film. Applicable to Films, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The genre of the film. Applicable to Films, Facebook datatype: string")
  @JsonProperty("genre")
  
  public String getGenre() {
    return genre;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }

  
  /**
   * The name of the Page with country codes appended for Global Brand Pages. Only visible to the Page admin, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The name of the Page with country codes appended for Global Brand Pages. Only visible to the Page admin, Facebook datatype: string")
  @JsonProperty("global_brand_page_name")
  
  public String getGlobalBrandPageName() {
    return globalBrandPageName;
  }
  public void setGlobalBrandPageName(String globalBrandPageName) {
    this.globalBrandPageName = globalBrandPageName;
  }

  
  /**
   * This brand's global Root ID, Facebook datatype: numeric string
   **/
  @ApiModelProperty(value = "This brand's global Root ID, Facebook datatype: numeric string")
  @JsonProperty("global_brand_root_id")
  
  public String getGlobalBrandRootId() {
    return globalBrandRootId;
  }
  public void setGlobalBrandRootId(String globalBrandRootId) {
    this.globalBrandRootId = globalBrandRootId;
  }

  
  /**
   * Indicates whether this Page has added the app making the query in a Page tab, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "Indicates whether this Page has added the app making the query in a Page tab, Facebook datatype: bool")
  @JsonProperty("has_added_app")
  
  public Boolean getHasAddedApp() {
    return hasAddedApp;
  }
  public void setHasAddedApp(Boolean hasAddedApp) {
    this.hasAddedApp = hasAddedApp;
  }

  
  /**
   * Indicates whether a user has accepted the TOS for running LeadGen Ads on the Page, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "Indicates whether a user has accepted the TOS for running LeadGen Ads on the Page, Facebook datatype: bool")
  @JsonProperty("leadgen_tos_accepted")
  
  public Boolean getLeadgenTosAccepted() {
    return leadgenTosAccepted;
  }
  public void setLeadgenTosAccepted(Boolean leadgenTosAccepted) {
    this.leadgenTosAccepted = leadgenTosAccepted;
  }

  
  /**
   * Hometown of the band. Applicable to Bands, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Hometown of the band. Applicable to Bands, Facebook datatype: string")
  @JsonProperty("hometown")
  
  public String getHometown() {
    return hometown;
  }
  public void setHometown(String hometown) {
    this.hometown = hometown;
  }

  
  /**
   * Indicates a single range of opening hours for a day. Each day can have 2 different hours ranges. The keys in the map are in the form of `{day}_{number}_{status}`.  `{day}` should be the first 3 characters of the day of the week, `{number}` should be either 1 or 2 to allow for the two different hours ranges per day. `{status}` should be either `open` or `close` to delineate the start or end of a time range. An example would be `mon_1_open` with value `17:00` and `mon_1_close` with value `21:15` which would represent a single opening range of 5pm to 9:15pm on Mondays, Facebook datatype: map<string, string>
   **/
  @ApiModelProperty(value = "Indicates a single range of opening hours for a day. Each day can have 2 different hours ranges. The keys in the map are in the form of `{day}_{number}_{status}`.  `{day}` should be the first 3 characters of the day of the week, `{number}` should be either 1 or 2 to allow for the two different hours ranges per day. `{status}` should be either `open` or `close` to delineate the start or end of a time range. An example would be `mon_1_open` with value `17:00` and `mon_1_close` with value `21:15` which would represent a single opening range of 5pm to 9:15pm on Mondays, Facebook datatype: map<string, string>")
  @JsonProperty("hours")
  
  public String getHours() {
    return hours;
  }
  public void setHours(String hours) {
    this.hours = hours;
  }

  
  /**
   * Influences on the band. Applicable to Bands, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Influences on the band. Applicable to Bands, Facebook datatype: string")
  @JsonProperty("influences")
  
  public String getInfluences() {
    return influences;
  }
  public void setInfluences(String influences) {
    this.influences = influences;
  }

  
  /**
   * Indicates whether the Page is a community Page, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "Indicates whether the Page is a community Page, Facebook datatype: bool")
  @JsonProperty("is_community_page")
  
  public Boolean getIsCommunityPage() {
    return isCommunityPage;
  }
  public void setIsCommunityPage(Boolean isCommunityPage) {
    this.isCommunityPage = isCommunityPage;
  }

  
  /**
   * Whether the business corresponding to this Page is permanently closed, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "Whether the business corresponding to this Page is permanently closed, Facebook datatype: bool")
  @JsonProperty("is_permanently_closed")
  
  public Boolean getIsPermanentlyClosed() {
    return isPermanentlyClosed;
  }
  public void setIsPermanentlyClosed(Boolean isPermanentlyClosed) {
    this.isPermanentlyClosed = isPermanentlyClosed;
  }

  
  /**
   * Indicates whether the Page is published and visible to non-admins, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "Indicates whether the Page is published and visible to non-admins, Facebook datatype: bool")
  @JsonProperty("is_published")
  
  public Boolean getIsPublished() {
    return isPublished;
  }
  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }

  
  /**
   * Indicates whether the Page is unclaimed, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "Indicates whether the Page is unclaimed, Facebook datatype: bool")
  @JsonProperty("is_unclaimed")
  
  public Boolean getIsUnclaimed() {
    return isUnclaimed;
  }
  public void setIsUnclaimed(Boolean isUnclaimed) {
    this.isUnclaimed = isUnclaimed;
  }

  
  /**
   * Pages with a large number of followers can be manually verified by Facebook as [having an authentic identity](https://www.facebook.com/help/196050490547892). This field indicates whether the page is verified by this process, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "Pages with a large number of followers can be manually verified by Facebook as [having an authentic identity](https://www.facebook.com/help/196050490547892). This field indicates whether the page is verified by this process, Facebook datatype: bool")
  @JsonProperty("is_verified")
  
  public Boolean getIsVerified() {
    return isVerified;
  }
  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }

  
  /**
   * The Page's Facebook URL, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The Page's Facebook URL, Facebook datatype: string")
  @JsonProperty("link")
  
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  
  /**
   * The company mission. Applicable to Companies, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The company mission. Applicable to Companies, Facebook datatype: string")
  @JsonProperty("mission")
  
  public String getMission() {
    return mission;
  }
  public void setMission(String mission) {
    this.mission = mission;
  }

  
  /**
   * MPG of the vehicle. Applicable to Vehicles, Facebook datatype: string
   **/
  @ApiModelProperty(value = "MPG of the vehicle. Applicable to Vehicles, Facebook datatype: string")
  @JsonProperty("mpg")
  
  public String getMpg() {
    return mpg;
  }
  public void setMpg(String mpg) {
    this.mpg = mpg;
  }

  
  /**
   * The TV network for the TV show. Applicable to TV Shows, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The TV network for the TV show. Applicable to TV Shows, Facebook datatype: string")
  @JsonProperty("network")
  
  public String getNetwork() {
    return network;
  }
  public void setNetwork(String network) {
    this.network = network;
  }

  
  /**
   * The number of people who have liked the Page, since the last login. Only visible to a page admin, Facebook datatype: unsigned int32
   **/
  @ApiModelProperty(value = "The number of people who have liked the Page, since the last login. Only visible to a page admin, Facebook datatype: unsigned int32")
  @JsonProperty("new_like_count")
  
  public Integer getNewLikeCount() {
    return newLikeCount;
  }
  public void setNewLikeCount(Integer newLikeCount) {
    this.newLikeCount = newLikeCount;
  }

  
  /**
   * Offer eligibility status. Only visible to a page admin, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "Offer eligibility status. Only visible to a page admin, Facebook datatype: bool")
  @JsonProperty("offer_eligible")
  
  public Boolean getOfferEligible() {
    return offerEligible;
  }
  public void setOfferEligible(Boolean offerEligible) {
    this.offerEligible = offerEligible;
  }

  
  /**
   * Parent Page for this Page, Facebook datatype: page
   **/
  @ApiModelProperty(value = "Parent Page for this Page, Facebook datatype: page")
  @JsonProperty("parent_page")
  
  public String getParentPage() {
    return parentPage;
  }
  public void setParentPage(String parentPage) {
    this.parentPage = parentPage;
  }

  
  /**
   * Parking information. Applicable to Businesses and Places, Facebook datatype: pageparking
   **/
  @ApiModelProperty(value = "Parking information. Applicable to Businesses and Places, Facebook datatype: pageparking")
  @JsonProperty("parking")
  
  public String getParking() {
    return parking;
  }
  public void setParking(String parking) {
    this.parking = parking;
  }

  
  /**
   * Payment options accepted by the business. Applicable to Restaurants or Nightlife, Facebook datatype: pagepaymentoptions
   **/
  @ApiModelProperty(value = "Payment options accepted by the business. Applicable to Restaurants or Nightlife, Facebook datatype: pagepaymentoptions")
  @JsonProperty("payment_options")
  
  public String getPaymentOptions() {
    return paymentOptions;
  }
  public void setPaymentOptions(String paymentOptions) {
    this.paymentOptions = paymentOptions;
  }

  
  /**
   * Personal information. Applicable to Pages representing People, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Personal information. Applicable to Pages representing People, Facebook datatype: string")
  @JsonProperty("personal_info")
  
  public String getPersonalInfo() {
    return personalInfo;
  }
  public void setPersonalInfo(String personalInfo) {
    this.personalInfo = personalInfo;
  }

  
  /**
   * Personal interests. Applicable to Pages representing People, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Personal interests. Applicable to Pages representing People, Facebook datatype: string")
  @JsonProperty("personal_interests")
  
  public String getPersonalInterests() {
    return personalInterests;
  }
  public void setPersonalInterests(String personalInterests) {
    this.personalInterests = personalInterests;
  }

  
  /**
   * Pharmacy safety information. Applicable to Pharmaceutical companies, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Pharmacy safety information. Applicable to Pharmaceutical companies, Facebook datatype: string")
  @JsonProperty("pharma_safety_info")
  
  public String getPharmaSafetyInfo() {
    return pharmaSafetyInfo;
  }
  public void setPharmaSafetyInfo(String pharmaSafetyInfo) {
    this.pharmaSafetyInfo = pharmaSafetyInfo;
  }

  
  /**
   * Phone number provided by a Page, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Phone number provided by a Page, Facebook datatype: string")
  @JsonProperty("phone")
  
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * The plot outline of the film. Applicable to Films, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The plot outline of the film. Applicable to Films, Facebook datatype: string")
  @JsonProperty("plot_outline")
  
  public String getPlotOutline() {
    return plotOutline;
  }
  public void setPlotOutline(String plotOutline) {
    this.plotOutline = plotOutline;
  }

  
  /**
   * Press contact information of the band. Applicable to Bands, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Press contact information of the band. Applicable to Bands, Facebook datatype: string")
  @JsonProperty("press_contact")
  
  public String getPressContact() {
    return pressContact;
  }
  public void setPressContact(String pressContact) {
    this.pressContact = pressContact;
  }

  
  /**
   * Price range of the business. Applicable to Restaurants or Nightlife. Can be one of `$` (0-10), `$$` (10-30), `$$$` (30-50), `$$$$` (50+) or `Unspecified`, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Price range of the business. Applicable to Restaurants or Nightlife. Can be one of `$` (0-10), `$$` (10-30), `$$$` (30-50), `$$$$` (50+) or `Unspecified`, Facebook datatype: string")
  @JsonProperty("price_range")
  
  public String getPriceRange() {
    return priceRange;
  }
  public void setPriceRange(String priceRange) {
    this.priceRange = priceRange;
  }

  
  /**
   * The productor of the film. Applicable to Films, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The productor of the film. Applicable to Films, Facebook datatype: string")
  @JsonProperty("produced_by")
  
  public String getProducedBy() {
    return producedBy;
  }
  public void setProducedBy(String producedBy) {
    this.producedBy = producedBy;
  }

  
  /**
   * The products of this company. Applicable to Companies, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The products of this company. Applicable to Companies, Facebook datatype: string")
  @JsonProperty("products")
  
  public String getProducts() {
    return products;
  }
  public void setProducts(String products) {
    this.products = products;
  }

  
  /**
   * Reason why a post isn't eligible for boosting. Only visible to Page Admins, Facebook datatype: bool
   **/
  @ApiModelProperty(value = "Reason why a post isn't eligible for boosting. Only visible to Page Admins, Facebook datatype: bool")
  @JsonProperty("promotion_eligible")
  
  public Boolean getPromotionEligible() {
    return promotionEligible;
  }
  public void setPromotionEligible(Boolean promotionEligible) {
    this.promotionEligible = promotionEligible;
  }

  
  /**
   * Reason, for which boosted posts are not eligible. Only visible to a page admin, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Reason, for which boosted posts are not eligible. Only visible to a page admin, Facebook datatype: string")
  @JsonProperty("promotion_ineligible_reason")
  
  public String getPromotionIneligibleReason() {
    return promotionIneligibleReason;
  }
  public void setPromotionIneligibleReason(String promotionIneligibleReason) {
    this.promotionIneligibleReason = promotionIneligibleReason;
  }

  
  /**
   * Public transit to the business. Applicable to Restaurants or Nightlife, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Public transit to the business. Applicable to Restaurants or Nightlife, Facebook datatype: string")
  @JsonProperty("public_transit")
  
  public String getPublicTransit() {
    return publicTransit;
  }
  public void setPublicTransit(String publicTransit) {
    this.publicTransit = publicTransit;
  }

  
  /**
   * Record label of the band. Applicable to Bands, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Record label of the band. Applicable to Bands, Facebook datatype: string")
  @JsonProperty("record_label")
  
  public String getRecordLabel() {
    return recordLabel;
  }
  public void setRecordLabel(String recordLabel) {
    this.recordLabel = recordLabel;
  }

  
  /**
   * The film's release date. Applicable to Films, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The film's release date. Applicable to Films, Facebook datatype: string")
  @JsonProperty("release_date")
  
  public String getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  
  /**
   * Services the restaurant provides. Applicable to Restaurants, Facebook datatype: pagerestaurantservices
   **/
  @ApiModelProperty(value = "Services the restaurant provides. Applicable to Restaurants, Facebook datatype: pagerestaurantservices")
  @JsonProperty("restaurant_services")
  
  public String getRestaurantServices() {
    return restaurantServices;
  }
  public void setRestaurantServices(String restaurantServices) {
    this.restaurantServices = restaurantServices;
  }

  
  /**
   * The restaurant's specialties. Applicable to Restaurants, Facebook datatype: pagerestaurantspecialties
   **/
  @ApiModelProperty(value = "The restaurant's specialties. Applicable to Restaurants, Facebook datatype: pagerestaurantspecialties")
  @JsonProperty("restaurant_specialties")
  
  public String getRestaurantSpecialties() {
    return restaurantSpecialties;
  }
  public void setRestaurantSpecialties(String restaurantSpecialties) {
    this.restaurantSpecialties = restaurantSpecialties;
  }

  
  /**
   * The air schedule of the TV show. Applicable to TV Shows, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The air schedule of the TV show. Applicable to TV Shows, Facebook datatype: string")
  @JsonProperty("schedule")
  
  public String getSchedule() {
    return schedule;
  }
  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  
  /**
   * The screenwriter of the film. Applicable to Films, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The screenwriter of the film. Applicable to Films, Facebook datatype: string")
  @JsonProperty("screenplay_by")
  
  public String getScreenplayBy() {
    return screenplayBy;
  }
  public void setScreenplayBy(String screenplayBy) {
    this.screenplayBy = screenplayBy;
  }

  
  /**
   * The season information of the TV Show. Applicable to TV Shows, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The season information of the TV Show. Applicable to TV Shows, Facebook datatype: string")
  @JsonProperty("season")
  
  public String getSeason() {
    return season;
  }
  public void setSeason(String season) {
    this.season = season;
  }

  
  /**
   * The cast of the film. Applicable to Films, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The cast of the film. Applicable to Films, Facebook datatype: string")
  @JsonProperty("starring")
  
  public String getStarring() {
    return starring;
  }
  public void setStarring(String starring) {
    this.starring = starring;
  }

  
  /**
   * Unique store number for this location Page, Facebook datatype: unsigned int32
   **/
  @ApiModelProperty(value = "Unique store number for this location Page, Facebook datatype: unsigned int32")
  @JsonProperty("store_number")
  
  public Integer getStoreNumber() {
    return storeNumber;
  }
  public void setStoreNumber(Integer storeNumber) {
    this.storeNumber = storeNumber;
  }

  
  /**
   * The studio for the film production. Applicable to Films, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The studio for the film production. Applicable to Films, Facebook datatype: string")
  @JsonProperty("studio")
  
  public String getStudio() {
    return studio;
  }
  public void setStudio(String studio) {
    this.studio = studio;
  }

  
  /**
   * The number of people talking about this Page, Facebook datatype: unsigned int32
   **/
  @ApiModelProperty(value = "The number of people talking about this Page, Facebook datatype: unsigned int32")
  @JsonProperty("talking_about_count")
  
  public Integer getTalkingAboutCount() {
    return talkingAboutCount;
  }
  public void setTalkingAboutCount(Integer talkingAboutCount) {
    this.talkingAboutCount = talkingAboutCount;
  }

  
  /**
   * The social sentence and like count information for this Page. This is the same info used for the like button, Facebook datatype: engagement
   **/
  @ApiModelProperty(value = "The social sentence and like count information for this Page. This is the same info used for the like button, Facebook datatype: engagement")
  @JsonProperty("engagement")
  
  public String getEngagement() {
    return engagement;
  }
  public void setEngagement(String engagement) {
    this.engagement = engagement;
  }

  
  /**
   * The page address, if any, in a simple single line format., Facebook datatype: string
   **/
  @ApiModelProperty(value = "The page address, if any, in a simple single line format., Facebook datatype: string")
  @JsonProperty("single_line_address")
  
  public String getSingleLineAddress() {
    return singleLineAddress;
  }
  public void setSingleLineAddress(String singleLineAddress) {
    this.singleLineAddress = singleLineAddress;
  }

  
  /**
   * For places, the category of the place, Facebook datatype: enum
   **/
  @ApiModelProperty(value = "For places, the category of the place, Facebook datatype: enum")
  @JsonProperty("place_type")
  
  public String getPlaceType() {
    return placeType;
  }
  public void setPlaceType(String placeType) {
    this.placeType = placeType;
  }

  
  /**
   * Unread message count for the Page. Only visible to a page admin, Facebook datatype: unsigned int32
   **/
  @ApiModelProperty(value = "Unread message count for the Page. Only visible to a page admin, Facebook datatype: unsigned int32")
  @JsonProperty("unread_message_count")
  
  public Integer getUnreadMessageCount() {
    return unreadMessageCount;
  }
  public void setUnreadMessageCount(Integer unreadMessageCount) {
    this.unreadMessageCount = unreadMessageCount;
  }

  
  /**
   * Number of unread notifications. Only visible to a page admin, Facebook datatype: unsigned int32
   **/
  @ApiModelProperty(value = "Number of unread notifications. Only visible to a page admin, Facebook datatype: unsigned int32")
  @JsonProperty("unread_notif_count")
  
  public Integer getUnreadNotifCount() {
    return unreadNotifCount;
  }
  public void setUnreadNotifCount(Integer unreadNotifCount) {
    this.unreadNotifCount = unreadNotifCount;
  }

  
  /**
   * Unseen message count for the Page. Only visible to a page admin, Facebook datatype: unsigned int32
   **/
  @ApiModelProperty(value = "Unseen message count for the Page. Only visible to a page admin, Facebook datatype: unsigned int32")
  @JsonProperty("unseen_message_count")
  
  public Integer getUnseenMessageCount() {
    return unseenMessageCount;
  }
  public void setUnseenMessageCount(Integer unseenMessageCount) {
    this.unseenMessageCount = unseenMessageCount;
  }

  
  /**
   * The alias of the Page. For example, for www.facebook.com/platform the username is 'platform', Facebook datatype: string
   **/
  @ApiModelProperty(value = "The alias of the Page. For example, for www.facebook.com/platform the username is 'platform', Facebook datatype: string")
  @JsonProperty("username")
  
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   * Voip info, Facebook datatype: voipinfo
   **/
  @ApiModelProperty(value = "Voip info, Facebook datatype: voipinfo")
  @JsonProperty("voip_info")
  
  public String getVoipInfo() {
    return voipInfo;
  }
  public void setVoipInfo(String voipInfo) {
    this.voipInfo = voipInfo;
  }

  
  /**
   * The URL of the Page's website, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The URL of the Page's website, Facebook datatype: string")
  @JsonProperty("website")
  
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }

  
  /**
   * The number of visits to this Page's location. If the Page setting *Show map, check-ins and star ratings on the Page* (under *Page Settings > Page Info > Address*) is disabled, then this value will also be disabled, Facebook datatype: unsigned int32
   **/
  @ApiModelProperty(value = "The number of visits to this Page's location. If the Page setting *Show map, check-ins and star ratings on the Page* (under *Page Settings > Page Info > Address*) is disabled, then this value will also be disabled, Facebook datatype: unsigned int32")
  @JsonProperty("were_here_count")
  
  public Integer getWereHereCount() {
    return wereHereCount;
  }
  public void setWereHereCount(Integer wereHereCount) {
    this.wereHereCount = wereHereCount;
  }

  
  /**
   * The writer of the TV show. Applicable to TV Shows, Facebook datatype: string
   **/
  @ApiModelProperty(value = "The writer of the TV show. Applicable to TV Shows, Facebook datatype: string")
  @JsonProperty("written_by")
  
  public String getWrittenBy() {
    return writtenBy;
  }
  public void setWrittenBy(String writtenBy) {
    this.writtenBy = writtenBy;
  }

  
  /**
   * owner business of this object, Facebook datatype: business
   **/
  @ApiModelProperty(value = "owner business of this object, Facebook datatype: business")
  @JsonProperty("owner_business")
  
  public String getOwnerBusiness() {
    return ownerBusiness;
  }
  public void setOwnerBusiness(String ownerBusiness) {
    this.ownerBusiness = ownerBusiness;
  }

  
  /**
   * last used time of this object by the current viewer, Facebook datatype: datetime
   **/
  @ApiModelProperty(value = "last used time of this object by the current viewer, Facebook datatype: datetime")
  @JsonProperty("last_used_time")
  
  public String getLastUsedTime() {
    return lastUsedTime;
  }
  public void setLastUsedTime(String lastUsedTime) {
    this.lastUsedTime = lastUsedTime;
  }

  
  /**
   * relevance score of an asset, Facebook datatype: float
   **/
  @ApiModelProperty(value = "relevance score of an asset, Facebook datatype: float")
  @JsonProperty("asset_score")
  
  public Float getAssetScore() {
    return assetScore;
  }
  public void setAssetScore(Float assetScore) {
    this.assetScore = assetScore;
  }

  
  /**
   * Number of checkins at a place represented by a Page, Facebook datatype: unsigned int32
   **/
  @ApiModelProperty(value = "Number of checkins at a place represented by a Page, Facebook datatype: unsigned int32")
  @JsonProperty("checkins")
  
  public Integer getCheckins() {
    return checkins;
  }
  public void setCheckins(Integer checkins) {
    this.checkins = checkins;
  }

  
  /**
   * The number of users who like the Page. For Global Brand Pages this is the count for all pages across the brand, Facebook datatype: unsigned int32
   **/
  @ApiModelProperty(value = "The number of users who like the Page. For Global Brand Pages this is the count for all pages across the brand, Facebook datatype: unsigned int32")
  @JsonProperty("likes")
  
  public Integer getLikes() {
    return likes;
  }
  public void setLikes(Integer likes) {
    this.likes = likes;
  }

  
  /**
   * Members of this org. Applicable to Pages representing Team Orgs, Facebook datatype: string
   **/
  @ApiModelProperty(value = "Members of this org. Applicable to Pages representing Team Orgs, Facebook datatype: string")
  @JsonProperty("members")
  
  public String getMembers() {
    return members;
  }
  public void setMembers(String members) {
    this.members = members;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookUser {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    location: ").append(StringUtil.toIndentedString(location)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    about: ").append(StringUtil.toIndentedString(about)).append("\n");
    sb.append("    accessToken: ").append(StringUtil.toIndentedString(accessToken)).append("\n");
    sb.append("    adCampaign: ").append(StringUtil.toIndentedString(adCampaign)).append("\n");
    sb.append("    affiliation: ").append(StringUtil.toIndentedString(affiliation)).append("\n");
    sb.append("    appId: ").append(StringUtil.toIndentedString(appId)).append("\n");
    sb.append("    appLinks: ").append(StringUtil.toIndentedString(appLinks)).append("\n");
    sb.append("    artistsWeLike: ").append(StringUtil.toIndentedString(artistsWeLike)).append("\n");
    sb.append("    attire: ").append(StringUtil.toIndentedString(attire)).append("\n");
    sb.append("    awards: ").append(StringUtil.toIndentedString(awards)).append("\n");
    sb.append("    bandInterests: ").append(StringUtil.toIndentedString(bandInterests)).append("\n");
    sb.append("    bandMembers: ").append(StringUtil.toIndentedString(bandMembers)).append("\n");
    sb.append("    bestPage: ").append(StringUtil.toIndentedString(bestPage)).append("\n");
    sb.append("    bio: ").append(StringUtil.toIndentedString(bio)).append("\n");
    sb.append("    birthday: ").append(StringUtil.toIndentedString(birthday)).append("\n");
    sb.append("    bookingAgent: ").append(StringUtil.toIndentedString(bookingAgent)).append("\n");
    sb.append("    built: ").append(StringUtil.toIndentedString(built)).append("\n");
    sb.append("    business: ").append(StringUtil.toIndentedString(business)).append("\n");
    sb.append("    canCheckin: ").append(StringUtil.toIndentedString(canCheckin)).append("\n");
    sb.append("    canPost: ").append(StringUtil.toIndentedString(canPost)).append("\n");
    sb.append("    category: ").append(StringUtil.toIndentedString(category)).append("\n");
    sb.append("    categoryList: ").append(StringUtil.toIndentedString(categoryList)).append("\n");
    sb.append("    companyOverview: ").append(StringUtil.toIndentedString(companyOverview)).append("\n");
    sb.append("    contactAddress: ").append(StringUtil.toIndentedString(contactAddress)).append("\n");
    sb.append("    context: ").append(StringUtil.toIndentedString(context)).append("\n");
    sb.append("    countryPageLikes: ").append(StringUtil.toIndentedString(countryPageLikes)).append("\n");
    sb.append("    cover: ").append(StringUtil.toIndentedString(cover)).append("\n");
    sb.append("    culinaryTeam: ").append(StringUtil.toIndentedString(culinaryTeam)).append("\n");
    sb.append("    currentLocation: ").append(StringUtil.toIndentedString(currentLocation)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("    descriptionHtml: ").append(StringUtil.toIndentedString(descriptionHtml)).append("\n");
    sb.append("    directedBy: ").append(StringUtil.toIndentedString(directedBy)).append("\n");
    sb.append("    displaySubtext: ").append(StringUtil.toIndentedString(displaySubtext)).append("\n");
    sb.append("    emails: ").append(StringUtil.toIndentedString(emails)).append("\n");
    sb.append("    features: ").append(StringUtil.toIndentedString(features)).append("\n");
    sb.append("    foodStyles: ").append(StringUtil.toIndentedString(foodStyles)).append("\n");
    sb.append("    founded: ").append(StringUtil.toIndentedString(founded)).append("\n");
    sb.append("    generalInfo: ").append(StringUtil.toIndentedString(generalInfo)).append("\n");
    sb.append("    generalManager: ").append(StringUtil.toIndentedString(generalManager)).append("\n");
    sb.append("    genre: ").append(StringUtil.toIndentedString(genre)).append("\n");
    sb.append("    globalBrandPageName: ").append(StringUtil.toIndentedString(globalBrandPageName)).append("\n");
    sb.append("    globalBrandRootId: ").append(StringUtil.toIndentedString(globalBrandRootId)).append("\n");
    sb.append("    hasAddedApp: ").append(StringUtil.toIndentedString(hasAddedApp)).append("\n");
    sb.append("    leadgenTosAccepted: ").append(StringUtil.toIndentedString(leadgenTosAccepted)).append("\n");
    sb.append("    hometown: ").append(StringUtil.toIndentedString(hometown)).append("\n");
    sb.append("    hours: ").append(StringUtil.toIndentedString(hours)).append("\n");
    sb.append("    influences: ").append(StringUtil.toIndentedString(influences)).append("\n");
    sb.append("    isCommunityPage: ").append(StringUtil.toIndentedString(isCommunityPage)).append("\n");
    sb.append("    isPermanentlyClosed: ").append(StringUtil.toIndentedString(isPermanentlyClosed)).append("\n");
    sb.append("    isPublished: ").append(StringUtil.toIndentedString(isPublished)).append("\n");
    sb.append("    isUnclaimed: ").append(StringUtil.toIndentedString(isUnclaimed)).append("\n");
    sb.append("    isVerified: ").append(StringUtil.toIndentedString(isVerified)).append("\n");
    sb.append("    link: ").append(StringUtil.toIndentedString(link)).append("\n");
    sb.append("    mission: ").append(StringUtil.toIndentedString(mission)).append("\n");
    sb.append("    mpg: ").append(StringUtil.toIndentedString(mpg)).append("\n");
    sb.append("    network: ").append(StringUtil.toIndentedString(network)).append("\n");
    sb.append("    newLikeCount: ").append(StringUtil.toIndentedString(newLikeCount)).append("\n");
    sb.append("    offerEligible: ").append(StringUtil.toIndentedString(offerEligible)).append("\n");
    sb.append("    parentPage: ").append(StringUtil.toIndentedString(parentPage)).append("\n");
    sb.append("    parking: ").append(StringUtil.toIndentedString(parking)).append("\n");
    sb.append("    paymentOptions: ").append(StringUtil.toIndentedString(paymentOptions)).append("\n");
    sb.append("    personalInfo: ").append(StringUtil.toIndentedString(personalInfo)).append("\n");
    sb.append("    personalInterests: ").append(StringUtil.toIndentedString(personalInterests)).append("\n");
    sb.append("    pharmaSafetyInfo: ").append(StringUtil.toIndentedString(pharmaSafetyInfo)).append("\n");
    sb.append("    phone: ").append(StringUtil.toIndentedString(phone)).append("\n");
    sb.append("    plotOutline: ").append(StringUtil.toIndentedString(plotOutline)).append("\n");
    sb.append("    pressContact: ").append(StringUtil.toIndentedString(pressContact)).append("\n");
    sb.append("    priceRange: ").append(StringUtil.toIndentedString(priceRange)).append("\n");
    sb.append("    producedBy: ").append(StringUtil.toIndentedString(producedBy)).append("\n");
    sb.append("    products: ").append(StringUtil.toIndentedString(products)).append("\n");
    sb.append("    promotionEligible: ").append(StringUtil.toIndentedString(promotionEligible)).append("\n");
    sb.append("    promotionIneligibleReason: ").append(StringUtil.toIndentedString(promotionIneligibleReason)).append("\n");
    sb.append("    publicTransit: ").append(StringUtil.toIndentedString(publicTransit)).append("\n");
    sb.append("    recordLabel: ").append(StringUtil.toIndentedString(recordLabel)).append("\n");
    sb.append("    releaseDate: ").append(StringUtil.toIndentedString(releaseDate)).append("\n");
    sb.append("    restaurantServices: ").append(StringUtil.toIndentedString(restaurantServices)).append("\n");
    sb.append("    restaurantSpecialties: ").append(StringUtil.toIndentedString(restaurantSpecialties)).append("\n");
    sb.append("    schedule: ").append(StringUtil.toIndentedString(schedule)).append("\n");
    sb.append("    screenplayBy: ").append(StringUtil.toIndentedString(screenplayBy)).append("\n");
    sb.append("    season: ").append(StringUtil.toIndentedString(season)).append("\n");
    sb.append("    starring: ").append(StringUtil.toIndentedString(starring)).append("\n");
    sb.append("    storeNumber: ").append(StringUtil.toIndentedString(storeNumber)).append("\n");
    sb.append("    studio: ").append(StringUtil.toIndentedString(studio)).append("\n");
    sb.append("    talkingAboutCount: ").append(StringUtil.toIndentedString(talkingAboutCount)).append("\n");
    sb.append("    engagement: ").append(StringUtil.toIndentedString(engagement)).append("\n");
    sb.append("    singleLineAddress: ").append(StringUtil.toIndentedString(singleLineAddress)).append("\n");
    sb.append("    placeType: ").append(StringUtil.toIndentedString(placeType)).append("\n");
    sb.append("    unreadMessageCount: ").append(StringUtil.toIndentedString(unreadMessageCount)).append("\n");
    sb.append("    unreadNotifCount: ").append(StringUtil.toIndentedString(unreadNotifCount)).append("\n");
    sb.append("    unseenMessageCount: ").append(StringUtil.toIndentedString(unseenMessageCount)).append("\n");
    sb.append("    username: ").append(StringUtil.toIndentedString(username)).append("\n");
    sb.append("    voipInfo: ").append(StringUtil.toIndentedString(voipInfo)).append("\n");
    sb.append("    website: ").append(StringUtil.toIndentedString(website)).append("\n");
    sb.append("    wereHereCount: ").append(StringUtil.toIndentedString(wereHereCount)).append("\n");
    sb.append("    writtenBy: ").append(StringUtil.toIndentedString(writtenBy)).append("\n");
    sb.append("    ownerBusiness: ").append(StringUtil.toIndentedString(ownerBusiness)).append("\n");
    sb.append("    lastUsedTime: ").append(StringUtil.toIndentedString(lastUsedTime)).append("\n");
    sb.append("    assetScore: ").append(StringUtil.toIndentedString(assetScore)).append("\n");
    sb.append("    checkins: ").append(StringUtil.toIndentedString(checkins)).append("\n");
    sb.append("    likes: ").append(StringUtil.toIndentedString(likes)).append("\n");
    sb.append("    members: ").append(StringUtil.toIndentedString(members)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
