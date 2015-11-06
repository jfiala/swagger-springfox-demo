package at.fwd.swagger.spring.demo.user.model.facebook;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-25T20:06:58.230+01:00")
public class FacebookUser   {
  
  private String about = null;
  private String description = null;
  private String founded = null;
  private String id = null;
  private String name = null;
  private String accessToken = null;
  private String adCampaign = null;
  private String affiliation = null;
  private String appId = null;
  private String appLinks = null;
  private String artistsWeLike = null;
  private String attire = null;
  private String bandInterests = null;
  private String bandMembers = null;
  private String bestPage = null;
  private String bio = null;
  private String birthday = null;
  private String bookingAgent = null;
  private String built = null;
  private String business = null;
  private String canCheckin = null;
  private String canPost = null;
  private String category = null;
  private String categoryList = null;
  private String companyOverview = null;
  private String contactAddress = null;
  private String context = null;
  private String countryPageLikes = null;
  private String cover = null;
  private String culinaryTeam = null;
  private String currentLocation = null;
  private String descriptionHtml = null;
  private String directedBy = null;
  private String displaySubtext = null;
  private String emails = null;
  private String features = null;
  private String foodStyles = null;
  private String generalInfo = null;
  private String generalManager = null;
  private String genre = null;
  private String globalBrandPageName = null;
  private String globalBrandRootId = null;
  private String hasAddedApp = null;
  private String leadgenTosAccepted = null;
  private String hometown = null;
  private String hours = null;
  private String influences = null;
  private String isCommunityPage = null;
  private String isPermanentlyClosed = null;
  private String isPublished = null;
  private String isUnclaimed = null;
  private String isVerified = null;
  private String link = null;
  private String location = null;
  private String mission = null;
  private String mpg = null;
  private String network = null;
  private String newLikeCount = null;
  private String offerEligible = null;
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
  private String promotionEligible = null;
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
  private String storeNumber = null;
  private String studio = null;
  private String talkingAboutCount = null;
  private String engagement = null;
  private String singleLineAddress = null;
  private String placeType = null;
  private String unreadMessageCount = null;
  private String unreadNotifCount = null;
  private String unseenMessageCount = null;
  private String username = null;
  private String voipInfo = null;
  private String website = null;
  private String wereHereCount = null;
  private String writtenBy = null;
  private String ownerBusiness = null;
  private String lastUsedTime = null;
  private String assetScore = null;
  private String checkins = null;
  private String likes = null;
  private String members = null;

  
  /**
   * Information about the Page
   **/
  @ApiModelProperty(value = "Information about the Page")
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }

  
  /**
   * The description of the Page
   **/
  @ApiModelProperty(value = "The description of the Page")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * When the company was founded. Applicable to Pages in the Company category
   **/
  @ApiModelProperty(value = "When the company was founded. Applicable to Pages in the Company category")
  @JsonProperty("founded")
  public String getFounded() {
    return founded;
  }
  public void setFounded(String founded) {
    this.founded = founded;
  }

  
  /**
   * Page ID. No access token is required to access this field
   **/
  @ApiModelProperty(value = "Page ID. No access token is required to access this field")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The name of the Page
   **/
  @ApiModelProperty(value = "The name of the Page")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The access token you can use to act as the Page. Only visible to Page Admins
   **/
  @ApiModelProperty(value = "The access token you can use to act as the Page. Only visible to Page Admins")
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  
  /**
   * The Page's currently running promotion campaign
   **/
  @ApiModelProperty(value = "The Page's currently running promotion campaign")
  @JsonProperty("ad_campaign")
  public String getAdCampaign() {
    return adCampaign;
  }
  public void setAdCampaign(String adCampaign) {
    this.adCampaign = adCampaign;
  }

  
  /**
   * Affiliation of this person. Applicable to Pages representing people
   **/
  @ApiModelProperty(value = "Affiliation of this person. Applicable to Pages representing people")
  @JsonProperty("affiliation")
  public String getAffiliation() {
    return affiliation;
  }
  public void setAffiliation(String affiliation) {
    this.affiliation = affiliation;
  }

  
  /**
   * App ID for app-owned Pages and app Pages
   **/
  @ApiModelProperty(value = "App ID for app-owned Pages and app Pages")
  @JsonProperty("app_id")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }

  
  /**
   * AppLinks data associated with the Page's URL
   **/
  @ApiModelProperty(value = "AppLinks data associated with the Page's URL")
  @JsonProperty("app_links")
  public String getAppLinks() {
    return appLinks;
  }
  public void setAppLinks(String appLinks) {
    this.appLinks = appLinks;
  }

  
  /**
   * Artists the band likes. Applicable to Bands
   **/
  @ApiModelProperty(value = "Artists the band likes. Applicable to Bands")
  @JsonProperty("artists_we_like")
  public String getArtistsWeLike() {
    return artistsWeLike;
  }
  public void setArtistsWeLike(String artistsWeLike) {
    this.artistsWeLike = artistsWeLike;
  }

  
  /**
   * Dress code of the business. Applicable to Restaurants or Nightlife. Can be one of Casual, Dressy or Unspecified
   **/
  @ApiModelProperty(value = "Dress code of the business. Applicable to Restaurants or Nightlife. Can be one of Casual, Dressy or Unspecified")
  @JsonProperty("attire")
  public String getAttire() {
    return attire;
  }
  public void setAttire(String attire) {
    this.attire = attire;
  }

  
  /**
   * Band interests. Applicable to Bands
   **/
  @ApiModelProperty(value = "Band interests. Applicable to Bands")
  @JsonProperty("band_interests")
  public String getBandInterests() {
    return bandInterests;
  }
  public void setBandInterests(String bandInterests) {
    this.bandInterests = bandInterests;
  }

  
  /**
   * Members of the band. Applicable to Bands
   **/
  @ApiModelProperty(value = "Members of the band. Applicable to Bands")
  @JsonProperty("band_members")
  public String getBandMembers() {
    return bandMembers;
  }
  public void setBandMembers(String bandMembers) {
    this.bandMembers = bandMembers;
  }

  
  /**
   * The best available Page on Facebook for the concept represented by this Page. The best available Page takes into account authenticity and the number of likes
   **/
  @ApiModelProperty(value = "The best available Page on Facebook for the concept represented by this Page. The best available Page takes into account authenticity and the number of likes")
  @JsonProperty("best_page")
  public String getBestPage() {
    return bestPage;
  }
  public void setBestPage(String bestPage) {
    this.bestPage = bestPage;
  }

  
  /**
   * Biography of the band. Applicable to Bands
   **/
  @ApiModelProperty(value = "Biography of the band. Applicable to Bands")
  @JsonProperty("bio")
  public String getBio() {
    return bio;
  }
  public void setBio(String bio) {
    this.bio = bio;
  }

  
  /**
   * Birthday of this person. Applicable to Pages representing people
   **/
  @ApiModelProperty(value = "Birthday of this person. Applicable to Pages representing people")
  @JsonProperty("birthday")
  public String getBirthday() {
    return birthday;
  }
  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  
  /**
   * Booking agent of the band. Applicable to Bands
   **/
  @ApiModelProperty(value = "Booking agent of the band. Applicable to Bands")
  @JsonProperty("booking_agent")
  public String getBookingAgent() {
    return bookingAgent;
  }
  public void setBookingAgent(String bookingAgent) {
    this.bookingAgent = bookingAgent;
  }

  
  /**
   * Year vehicle was built. Applicable to Vehicles
   **/
  @ApiModelProperty(value = "Year vehicle was built. Applicable to Vehicles")
  @JsonProperty("built")
  public String getBuilt() {
    return built;
  }
  public void setBuilt(String built) {
    this.built = built;
  }

  
  /**
   * The Business associated with this Page.  Visible only with a page access token or a user access token that has admin rights on the page
   **/
  @ApiModelProperty(value = "The Business associated with this Page.  Visible only with a page access token or a user access token that has admin rights on the page")
  @JsonProperty("business")
  public String getBusiness() {
    return business;
  }
  public void setBusiness(String business) {
    this.business = business;
  }

  
  /**
   * Whether this page has checkin functionality enabled
   **/
  @ApiModelProperty(value = "Whether this page has checkin functionality enabled")
  @JsonProperty("can_checkin")
  public String getCanCheckin() {
    return canCheckin;
  }
  public void setCanCheckin(String canCheckin) {
    this.canCheckin = canCheckin;
  }

  
  /**
   * Whether the current session user can post on this Page
   **/
  @ApiModelProperty(value = "Whether the current session user can post on this Page")
  @JsonProperty("can_post")
  public String getCanPost() {
    return canPost;
  }
  public void setCanPost(String canPost) {
    this.canPost = canPost;
  }

  
  /**
   * The Page's category. e.g. Product/Service, Computers/Technology
   **/
  @ApiModelProperty(value = "The Page's category. e.g. Product/Service, Computers/Technology")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   * The Page's sub-categories
   **/
  @ApiModelProperty(value = "The Page's sub-categories")
  @JsonProperty("category_list")
  public String getCategoryList() {
    return categoryList;
  }
  public void setCategoryList(String categoryList) {
    this.categoryList = categoryList;
  }

  
  /**
   * The company overview. Applicable to Companies
   **/
  @ApiModelProperty(value = "The company overview. Applicable to Companies")
  @JsonProperty("company_overview")
  public String getCompanyOverview() {
    return companyOverview;
  }
  public void setCompanyOverview(String companyOverview) {
    this.companyOverview = companyOverview;
  }

  
  /**
   * The mailing or contact address for this page. This field will be blank if the contact address is the same as the physical address
   **/
  @ApiModelProperty(value = "The mailing or contact address for this page. This field will be blank if the contact address is the same as the physical address")
  @JsonProperty("contact_address")
  public String getContactAddress() {
    return contactAddress;
  }
  public void setContactAddress(String contactAddress) {
    this.contactAddress = contactAddress;
  }

  
  /**
   * Social context for this Page
   **/
  @ApiModelProperty(value = "Social context for this Page")
  @JsonProperty("context")
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
  }

  
  /**
   * If this is a Page in a Global Pages hierarchy, the number of people who are being directed to this Page.
   **/
  @ApiModelProperty(value = "If this is a Page in a Global Pages hierarchy, the number of people who are being directed to this Page.")
  @JsonProperty("country_page_likes")
  public String getCountryPageLikes() {
    return countryPageLikes;
  }
  public void setCountryPageLikes(String countryPageLikes) {
    this.countryPageLikes = countryPageLikes;
  }

  
  /**
   * Information about the page's cover photo
   **/
  @ApiModelProperty(value = "Information about the page's cover photo")
  @JsonProperty("cover")
  public String getCover() {
    return cover;
  }
  public void setCover(String cover) {
    this.cover = cover;
  }

  
  /**
   * Culinary team of the business. Applicable to Restaurants or Nightlife
   **/
  @ApiModelProperty(value = "Culinary team of the business. Applicable to Restaurants or Nightlife")
  @JsonProperty("culinary_team")
  public String getCulinaryTeam() {
    return culinaryTeam;
  }
  public void setCulinaryTeam(String culinaryTeam) {
    this.culinaryTeam = culinaryTeam;
  }

  
  /**
   * Current location of the Page
   **/
  @ApiModelProperty(value = "Current location of the Page")
  @JsonProperty("current_location")
  public String getCurrentLocation() {
    return currentLocation;
  }
  public void setCurrentLocation(String currentLocation) {
    this.currentLocation = currentLocation;
  }

  
  /**
   * The description of the Page in raw HTML
   **/
  @ApiModelProperty(value = "The description of the Page in raw HTML")
  @JsonProperty("description_html")
  public String getDescriptionHtml() {
    return descriptionHtml;
  }
  public void setDescriptionHtml(String descriptionHtml) {
    this.descriptionHtml = descriptionHtml;
  }

  
  /**
   * The director of the film. Applicable to Films
   **/
  @ApiModelProperty(value = "The director of the film. Applicable to Films")
  @JsonProperty("directed_by")
  public String getDirectedBy() {
    return directedBy;
  }
  public void setDirectedBy(String directedBy) {
    this.directedBy = directedBy;
  }

  
  /**
   * Subtext about the Page being viewed
   **/
  @ApiModelProperty(value = "Subtext about the Page being viewed")
  @JsonProperty("display_subtext")
  public String getDisplaySubtext() {
    return displaySubtext;
  }
  public void setDisplaySubtext(String displaySubtext) {
    this.displaySubtext = displaySubtext;
  }

  
  /**
   * The emails listed in the About section of a Page
   **/
  @ApiModelProperty(value = "The emails listed in the About section of a Page")
  @JsonProperty("emails")
  public String getEmails() {
    return emails;
  }
  public void setEmails(String emails) {
    this.emails = emails;
  }

  
  /**
   * Features of the vehicle. Applicable to Vehicles
   **/
  @ApiModelProperty(value = "Features of the vehicle. Applicable to Vehicles")
  @JsonProperty("features")
  public String getFeatures() {
    return features;
  }
  public void setFeatures(String features) {
    this.features = features;
  }

  
  /**
   * The restaurant's food styles. Applicable to Restaurants
   **/
  @ApiModelProperty(value = "The restaurant's food styles. Applicable to Restaurants")
  @JsonProperty("food_styles")
  public String getFoodStyles() {
    return foodStyles;
  }
  public void setFoodStyles(String foodStyles) {
    this.foodStyles = foodStyles;
  }

  
  /**
   * General information provided by the Page
   **/
  @ApiModelProperty(value = "General information provided by the Page")
  @JsonProperty("general_info")
  public String getGeneralInfo() {
    return generalInfo;
  }
  public void setGeneralInfo(String generalInfo) {
    this.generalInfo = generalInfo;
  }

  
  /**
   * General manager of the business. Applicable to Restaurants or Nightlife
   **/
  @ApiModelProperty(value = "General manager of the business. Applicable to Restaurants or Nightlife")
  @JsonProperty("general_manager")
  public String getGeneralManager() {
    return generalManager;
  }
  public void setGeneralManager(String generalManager) {
    this.generalManager = generalManager;
  }

  
  /**
   * The genre of the film. Applicable to Films
   **/
  @ApiModelProperty(value = "The genre of the film. Applicable to Films")
  @JsonProperty("genre")
  public String getGenre() {
    return genre;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }

  
  /**
   * The name of the Page with country codes appended for Global Brand Pages. Only visible to the Page admin
   **/
  @ApiModelProperty(value = "The name of the Page with country codes appended for Global Brand Pages. Only visible to the Page admin")
  @JsonProperty("global_brand_page_name")
  public String getGlobalBrandPageName() {
    return globalBrandPageName;
  }
  public void setGlobalBrandPageName(String globalBrandPageName) {
    this.globalBrandPageName = globalBrandPageName;
  }

  
  /**
   * This brand's global Root ID
   **/
  @ApiModelProperty(value = "This brand's global Root ID")
  @JsonProperty("global_brand_root_id")
  public String getGlobalBrandRootId() {
    return globalBrandRootId;
  }
  public void setGlobalBrandRootId(String globalBrandRootId) {
    this.globalBrandRootId = globalBrandRootId;
  }

  
  /**
   * Indicates whether this Page has added the app making the query in a Page tab
   **/
  @ApiModelProperty(value = "Indicates whether this Page has added the app making the query in a Page tab")
  @JsonProperty("has_added_app")
  public String getHasAddedApp() {
    return hasAddedApp;
  }
  public void setHasAddedApp(String hasAddedApp) {
    this.hasAddedApp = hasAddedApp;
  }

  
  /**
   * Indicates whether a user has accepted the TOS for running LeadGen Ads on the Page
   **/
  @ApiModelProperty(value = "Indicates whether a user has accepted the TOS for running LeadGen Ads on the Page")
  @JsonProperty("leadgen_tos_accepted")
  public String getLeadgenTosAccepted() {
    return leadgenTosAccepted;
  }
  public void setLeadgenTosAccepted(String leadgenTosAccepted) {
    this.leadgenTosAccepted = leadgenTosAccepted;
  }

  
  /**
   * Hometown of the band. Applicable to Bands
   **/
  @ApiModelProperty(value = "Hometown of the band. Applicable to Bands")
  @JsonProperty("hometown")
  public String getHometown() {
    return hometown;
  }
  public void setHometown(String hometown) {
    this.hometown = hometown;
  }

  
  /**
   * Indicates a single range of opening hours for a day. Each day can have 2 different hours ranges. The keys in the map are in the form of `{day}_{number}_{status}`.  `{day}` should be the first 3 characters of the day of the week, `{number}` should be either 1 or 2 to allow for the two different hours ranges per day. `{status}` should be either `open` or `close` to delineate the start or end of a time range. An example would be `mon_1_open` with value `17:00` and `mon_1_close` with value `21:15` which would represent a single opening range of 5pm to 9:15pm on Mondays
   **/
  @ApiModelProperty(value = "Indicates a single range of opening hours for a day. Each day can have 2 different hours ranges. The keys in the map are in the form of `{day}_{number}_{status}`.  `{day}` should be the first 3 characters of the day of the week, `{number}` should be either 1 or 2 to allow for the two different hours ranges per day. `{status}` should be either `open` or `close` to delineate the start or end of a time range. An example would be `mon_1_open` with value `17:00` and `mon_1_close` with value `21:15` which would represent a single opening range of 5pm to 9:15pm on Mondays")
  @JsonProperty("hours")
  public String getHours() {
    return hours;
  }
  public void setHours(String hours) {
    this.hours = hours;
  }

  
  /**
   * Influences on the band. Applicable to Bands
   **/
  @ApiModelProperty(value = "Influences on the band. Applicable to Bands")
  @JsonProperty("influences")
  public String getInfluences() {
    return influences;
  }
  public void setInfluences(String influences) {
    this.influences = influences;
  }

  
  /**
   * Indicates whether the Page is a community Page
   **/
  @ApiModelProperty(value = "Indicates whether the Page is a community Page")
  @JsonProperty("is_community_page")
  public String getIsCommunityPage() {
    return isCommunityPage;
  }
  public void setIsCommunityPage(String isCommunityPage) {
    this.isCommunityPage = isCommunityPage;
  }

  
  /**
   * Whether the business corresponding to this Page is permanently closed
   **/
  @ApiModelProperty(value = "Whether the business corresponding to this Page is permanently closed")
  @JsonProperty("is_permanently_closed")
  public String getIsPermanentlyClosed() {
    return isPermanentlyClosed;
  }
  public void setIsPermanentlyClosed(String isPermanentlyClosed) {
    this.isPermanentlyClosed = isPermanentlyClosed;
  }

  
  /**
   * Indicates whether the Page is published and visible to non-admins
   **/
  @ApiModelProperty(value = "Indicates whether the Page is published and visible to non-admins")
  @JsonProperty("is_published")
  public String getIsPublished() {
    return isPublished;
  }
  public void setIsPublished(String isPublished) {
    this.isPublished = isPublished;
  }

  
  /**
   * Indicates whether the Page is unclaimed
   **/
  @ApiModelProperty(value = "Indicates whether the Page is unclaimed")
  @JsonProperty("is_unclaimed")
  public String getIsUnclaimed() {
    return isUnclaimed;
  }
  public void setIsUnclaimed(String isUnclaimed) {
    this.isUnclaimed = isUnclaimed;
  }

  
  /**
   * Pages with a large number of followers can be manually verified by Facebook as [having an authentic identity](https://www.facebook.com/help/196050490547892). This field indicates whether the page is verified by this process
   **/
  @ApiModelProperty(value = "Pages with a large number of followers can be manually verified by Facebook as [having an authentic identity](https://www.facebook.com/help/196050490547892). This field indicates whether the page is verified by this process")
  @JsonProperty("is_verified")
  public String getIsVerified() {
    return isVerified;
  }
  public void setIsVerified(String isVerified) {
    this.isVerified = isVerified;
  }

  
  /**
   * The Page's Facebook URL
   **/
  @ApiModelProperty(value = "The Page's Facebook URL")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  
  /**
   * The location of this place. Applicable to all Places
   **/
  @ApiModelProperty(value = "The location of this place. Applicable to all Places")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  
  /**
   * The company mission. Applicable to Companies
   **/
  @ApiModelProperty(value = "The company mission. Applicable to Companies")
  @JsonProperty("mission")
  public String getMission() {
    return mission;
  }
  public void setMission(String mission) {
    this.mission = mission;
  }

  
  /**
   * MPG of the vehicle. Applicable to Vehicles
   **/
  @ApiModelProperty(value = "MPG of the vehicle. Applicable to Vehicles")
  @JsonProperty("mpg")
  public String getMpg() {
    return mpg;
  }
  public void setMpg(String mpg) {
    this.mpg = mpg;
  }

  
  /**
   * The TV network for the TV show. Applicable to TV Shows
   **/
  @ApiModelProperty(value = "The TV network for the TV show. Applicable to TV Shows")
  @JsonProperty("network")
  public String getNetwork() {
    return network;
  }
  public void setNetwork(String network) {
    this.network = network;
  }

  
  /**
   * The number of people who have liked the Page, since the last login. Only visible to a page admin
   **/
  @ApiModelProperty(value = "The number of people who have liked the Page, since the last login. Only visible to a page admin")
  @JsonProperty("new_like_count")
  public String getNewLikeCount() {
    return newLikeCount;
  }
  public void setNewLikeCount(String newLikeCount) {
    this.newLikeCount = newLikeCount;
  }

  
  /**
   * Offer eligibility status. Only visible to a page admin
   **/
  @ApiModelProperty(value = "Offer eligibility status. Only visible to a page admin")
  @JsonProperty("offer_eligible")
  public String getOfferEligible() {
    return offerEligible;
  }
  public void setOfferEligible(String offerEligible) {
    this.offerEligible = offerEligible;
  }

  
  /**
   * Parent Page for this Page
   **/
  @ApiModelProperty(value = "Parent Page for this Page")
  @JsonProperty("parent_page")
  public String getParentPage() {
    return parentPage;
  }
  public void setParentPage(String parentPage) {
    this.parentPage = parentPage;
  }

  
  /**
   * Parking information. Applicable to Businesses and Places
   **/
  @ApiModelProperty(value = "Parking information. Applicable to Businesses and Places")
  @JsonProperty("parking")
  public String getParking() {
    return parking;
  }
  public void setParking(String parking) {
    this.parking = parking;
  }

  
  /**
   * Payment options accepted by the business. Applicable to Restaurants or Nightlife
   **/
  @ApiModelProperty(value = "Payment options accepted by the business. Applicable to Restaurants or Nightlife")
  @JsonProperty("payment_options")
  public String getPaymentOptions() {
    return paymentOptions;
  }
  public void setPaymentOptions(String paymentOptions) {
    this.paymentOptions = paymentOptions;
  }

  
  /**
   * Personal information. Applicable to Pages representing People
   **/
  @ApiModelProperty(value = "Personal information. Applicable to Pages representing People")
  @JsonProperty("personal_info")
  public String getPersonalInfo() {
    return personalInfo;
  }
  public void setPersonalInfo(String personalInfo) {
    this.personalInfo = personalInfo;
  }

  
  /**
   * Personal interests. Applicable to Pages representing People
   **/
  @ApiModelProperty(value = "Personal interests. Applicable to Pages representing People")
  @JsonProperty("personal_interests")
  public String getPersonalInterests() {
    return personalInterests;
  }
  public void setPersonalInterests(String personalInterests) {
    this.personalInterests = personalInterests;
  }

  
  /**
   * Pharmacy safety information. Applicable to Pharmaceutical companies
   **/
  @ApiModelProperty(value = "Pharmacy safety information. Applicable to Pharmaceutical companies")
  @JsonProperty("pharma_safety_info")
  public String getPharmaSafetyInfo() {
    return pharmaSafetyInfo;
  }
  public void setPharmaSafetyInfo(String pharmaSafetyInfo) {
    this.pharmaSafetyInfo = pharmaSafetyInfo;
  }

  
  /**
   * Phone number provided by a Page
   **/
  @ApiModelProperty(value = "Phone number provided by a Page")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * The plot outline of the film. Applicable to Films
   **/
  @ApiModelProperty(value = "The plot outline of the film. Applicable to Films")
  @JsonProperty("plot_outline")
  public String getPlotOutline() {
    return plotOutline;
  }
  public void setPlotOutline(String plotOutline) {
    this.plotOutline = plotOutline;
  }

  
  /**
   * Press contact information of the band. Applicable to Bands
   **/
  @ApiModelProperty(value = "Press contact information of the band. Applicable to Bands")
  @JsonProperty("press_contact")
  public String getPressContact() {
    return pressContact;
  }
  public void setPressContact(String pressContact) {
    this.pressContact = pressContact;
  }

  
  /**
   * Price range of the business. Applicable to Restaurants or Nightlife. Can be one of `$` (0-10), `$$` (10-30), `$$$` (30-50), `$$$$` (50+) or `Unspecified`
   **/
  @ApiModelProperty(value = "Price range of the business. Applicable to Restaurants or Nightlife. Can be one of `$` (0-10), `$$` (10-30), `$$$` (30-50), `$$$$` (50+) or `Unspecified`")
  @JsonProperty("price_range")
  public String getPriceRange() {
    return priceRange;
  }
  public void setPriceRange(String priceRange) {
    this.priceRange = priceRange;
  }

  
  /**
   * The productor of the film. Applicable to Films
   **/
  @ApiModelProperty(value = "The productor of the film. Applicable to Films")
  @JsonProperty("produced_by")
  public String getProducedBy() {
    return producedBy;
  }
  public void setProducedBy(String producedBy) {
    this.producedBy = producedBy;
  }

  
  /**
   * The products of this company. Applicable to Companies
   **/
  @ApiModelProperty(value = "The products of this company. Applicable to Companies")
  @JsonProperty("products")
  public String getProducts() {
    return products;
  }
  public void setProducts(String products) {
    this.products = products;
  }

  
  /**
   * Reason why a post isn't eligible for boosting. Only visible to Page Admins
   **/
  @ApiModelProperty(value = "Reason why a post isn't eligible for boosting. Only visible to Page Admins")
  @JsonProperty("promotion_eligible")
  public String getPromotionEligible() {
    return promotionEligible;
  }
  public void setPromotionEligible(String promotionEligible) {
    this.promotionEligible = promotionEligible;
  }

  
  /**
   * Reason, for which boosted posts are not eligible. Only visible to a page admin
   **/
  @ApiModelProperty(value = "Reason, for which boosted posts are not eligible. Only visible to a page admin")
  @JsonProperty("promotion_ineligible_reason")
  public String getPromotionIneligibleReason() {
    return promotionIneligibleReason;
  }
  public void setPromotionIneligibleReason(String promotionIneligibleReason) {
    this.promotionIneligibleReason = promotionIneligibleReason;
  }

  
  /**
   * Public transit to the business. Applicable to Restaurants or Nightlife
   **/
  @ApiModelProperty(value = "Public transit to the business. Applicable to Restaurants or Nightlife")
  @JsonProperty("public_transit")
  public String getPublicTransit() {
    return publicTransit;
  }
  public void setPublicTransit(String publicTransit) {
    this.publicTransit = publicTransit;
  }

  
  /**
   * Record label of the band. Applicable to Bands
   **/
  @ApiModelProperty(value = "Record label of the band. Applicable to Bands")
  @JsonProperty("record_label")
  public String getRecordLabel() {
    return recordLabel;
  }
  public void setRecordLabel(String recordLabel) {
    this.recordLabel = recordLabel;
  }

  
  /**
   * The film's release date. Applicable to Films
   **/
  @ApiModelProperty(value = "The film's release date. Applicable to Films")
  @JsonProperty("release_date")
  public String getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  
  /**
   * Services the restaurant provides. Applicable to Restaurants
   **/
  @ApiModelProperty(value = "Services the restaurant provides. Applicable to Restaurants")
  @JsonProperty("restaurant_services")
  public String getRestaurantServices() {
    return restaurantServices;
  }
  public void setRestaurantServices(String restaurantServices) {
    this.restaurantServices = restaurantServices;
  }

  
  /**
   * The restaurant's specialties. Applicable to Restaurants
   **/
  @ApiModelProperty(value = "The restaurant's specialties. Applicable to Restaurants")
  @JsonProperty("restaurant_specialties")
  public String getRestaurantSpecialties() {
    return restaurantSpecialties;
  }
  public void setRestaurantSpecialties(String restaurantSpecialties) {
    this.restaurantSpecialties = restaurantSpecialties;
  }

  
  /**
   * The air schedule of the TV show. Applicable to TV Shows
   **/
  @ApiModelProperty(value = "The air schedule of the TV show. Applicable to TV Shows")
  @JsonProperty("schedule")
  public String getSchedule() {
    return schedule;
  }
  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  
  /**
   * The screenwriter of the film. Applicable to Films
   **/
  @ApiModelProperty(value = "The screenwriter of the film. Applicable to Films")
  @JsonProperty("screenplay_by")
  public String getScreenplayBy() {
    return screenplayBy;
  }
  public void setScreenplayBy(String screenplayBy) {
    this.screenplayBy = screenplayBy;
  }

  
  /**
   * The season information of the TV Show. Applicable to TV Shows
   **/
  @ApiModelProperty(value = "The season information of the TV Show. Applicable to TV Shows")
  @JsonProperty("season")
  public String getSeason() {
    return season;
  }
  public void setSeason(String season) {
    this.season = season;
  }

  
  /**
   * The cast of the film. Applicable to Films
   **/
  @ApiModelProperty(value = "The cast of the film. Applicable to Films")
  @JsonProperty("starring")
  public String getStarring() {
    return starring;
  }
  public void setStarring(String starring) {
    this.starring = starring;
  }

  
  /**
   * Unique store number for this location Page
   **/
  @ApiModelProperty(value = "Unique store number for this location Page")
  @JsonProperty("store_number")
  public String getStoreNumber() {
    return storeNumber;
  }
  public void setStoreNumber(String storeNumber) {
    this.storeNumber = storeNumber;
  }

  
  /**
   * The studio for the film production. Applicable to Films
   **/
  @ApiModelProperty(value = "The studio for the film production. Applicable to Films")
  @JsonProperty("studio")
  public String getStudio() {
    return studio;
  }
  public void setStudio(String studio) {
    this.studio = studio;
  }

  
  /**
   * The number of people talking about this Page
   **/
  @ApiModelProperty(value = "The number of people talking about this Page")
  @JsonProperty("talking_about_count")
  public String getTalkingAboutCount() {
    return talkingAboutCount;
  }
  public void setTalkingAboutCount(String talkingAboutCount) {
    this.talkingAboutCount = talkingAboutCount;
  }

  
  /**
   * The social sentence and like count information for this Page. This is the same info used for the like button
   **/
  @ApiModelProperty(value = "The social sentence and like count information for this Page. This is the same info used for the like button")
  @JsonProperty("engagement")
  public String getEngagement() {
    return engagement;
  }
  public void setEngagement(String engagement) {
    this.engagement = engagement;
  }

  
  /**
   * The page address, if any, in a simple single line format.
   **/
  @ApiModelProperty(value = "The page address, if any, in a simple single line format.")
  @JsonProperty("single_line_address")
  public String getSingleLineAddress() {
    return singleLineAddress;
  }
  public void setSingleLineAddress(String singleLineAddress) {
    this.singleLineAddress = singleLineAddress;
  }

  
  /**
   * For places, the category of the place
   **/
  @ApiModelProperty(value = "For places, the category of the place")
  @JsonProperty("place_type")
  public String getPlaceType() {
    return placeType;
  }
  public void setPlaceType(String placeType) {
    this.placeType = placeType;
  }

  
  /**
   * Unread message count for the Page. Only visible to a page admin
   **/
  @ApiModelProperty(value = "Unread message count for the Page. Only visible to a page admin")
  @JsonProperty("unread_message_count")
  public String getUnreadMessageCount() {
    return unreadMessageCount;
  }
  public void setUnreadMessageCount(String unreadMessageCount) {
    this.unreadMessageCount = unreadMessageCount;
  }

  
  /**
   * Number of unread notifications. Only visible to a page admin
   **/
  @ApiModelProperty(value = "Number of unread notifications. Only visible to a page admin")
  @JsonProperty("unread_notif_count")
  public String getUnreadNotifCount() {
    return unreadNotifCount;
  }
  public void setUnreadNotifCount(String unreadNotifCount) {
    this.unreadNotifCount = unreadNotifCount;
  }

  
  /**
   * Unseen message count for the Page. Only visible to a page admin
   **/
  @ApiModelProperty(value = "Unseen message count for the Page. Only visible to a page admin")
  @JsonProperty("unseen_message_count")
  public String getUnseenMessageCount() {
    return unseenMessageCount;
  }
  public void setUnseenMessageCount(String unseenMessageCount) {
    this.unseenMessageCount = unseenMessageCount;
  }

  
  /**
   * The alias of the Page. For example, for www.facebook.com/platform the username is 'platform'
   **/
  @ApiModelProperty(value = "The alias of the Page. For example, for www.facebook.com/platform the username is 'platform'")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   * Voip info
   **/
  @ApiModelProperty(value = "Voip info")
  @JsonProperty("voip_info")
  public String getVoipInfo() {
    return voipInfo;
  }
  public void setVoipInfo(String voipInfo) {
    this.voipInfo = voipInfo;
  }

  
  /**
   * The URL of the Page's website
   **/
  @ApiModelProperty(value = "The URL of the Page's website")
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }

  
  /**
   * The number of visits to this Page's location. If the Page setting *Show map, check-ins and star ratings on the Page* (under *Page Settings > Page Info > Address*) is disabled, then this value will also be disabled
   **/
  @ApiModelProperty(value = "The number of visits to this Page's location. If the Page setting *Show map, check-ins and star ratings on the Page* (under *Page Settings > Page Info > Address*) is disabled, then this value will also be disabled")
  @JsonProperty("were_here_count")
  public String getWereHereCount() {
    return wereHereCount;
  }
  public void setWereHereCount(String wereHereCount) {
    this.wereHereCount = wereHereCount;
  }

  
  /**
   * The writer of the TV show. Applicable to TV Shows
   **/
  @ApiModelProperty(value = "The writer of the TV show. Applicable to TV Shows")
  @JsonProperty("written_by")
  public String getWrittenBy() {
    return writtenBy;
  }
  public void setWrittenBy(String writtenBy) {
    this.writtenBy = writtenBy;
  }

  
  /**
   * owner business of this object
   **/
  @ApiModelProperty(value = "owner business of this object")
  @JsonProperty("owner_business")
  public String getOwnerBusiness() {
    return ownerBusiness;
  }
  public void setOwnerBusiness(String ownerBusiness) {
    this.ownerBusiness = ownerBusiness;
  }

  
  /**
   * last used time of this object by the current viewer
   **/
  @ApiModelProperty(value = "last used time of this object by the current viewer")
  @JsonProperty("last_used_time")
  public String getLastUsedTime() {
    return lastUsedTime;
  }
  public void setLastUsedTime(String lastUsedTime) {
    this.lastUsedTime = lastUsedTime;
  }

  
  /**
   * relevance score of an asset
   **/
  @ApiModelProperty(value = "relevance score of an asset")
  @JsonProperty("asset_score")
  public String getAssetScore() {
    return assetScore;
  }
  public void setAssetScore(String assetScore) {
    this.assetScore = assetScore;
  }

  
  /**
   * Number of checkins at a place represented by a Page
   **/
  @ApiModelProperty(value = "Number of checkins at a place represented by a Page")
  @JsonProperty("checkins")
  public String getCheckins() {
    return checkins;
  }
  public void setCheckins(String checkins) {
    this.checkins = checkins;
  }

  
  /**
   * The number of users who like the Page. For Global Brand Pages this is the count for all pages across the brand
   **/
  @ApiModelProperty(value = "The number of users who like the Page. For Global Brand Pages this is the count for all pages across the brand")
  @JsonProperty("likes")
  public String getLikes() {
    return likes;
  }
  public void setLikes(String likes) {
    this.likes = likes;
  }

  
  /**
   * Members of this org. Applicable to Pages representing Team Orgs
   **/
  @ApiModelProperty(value = "Members of this org. Applicable to Pages representing Team Orgs")
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
    /*
    sb.append("    about: ").append(StringUtil.toIndentedString(about)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("    founded: ").append(StringUtil.toIndentedString(founded)).append("\n");
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    accessToken: ").append(StringUtil.toIndentedString(accessToken)).append("\n");
    sb.append("    adCampaign: ").append(StringUtil.toIndentedString(adCampaign)).append("\n");
    sb.append("    affiliation: ").append(StringUtil.toIndentedString(affiliation)).append("\n");
    sb.append("    appId: ").append(StringUtil.toIndentedString(appId)).append("\n");
    sb.append("    appLinks: ").append(StringUtil.toIndentedString(appLinks)).append("\n");
    sb.append("    artistsWeLike: ").append(StringUtil.toIndentedString(artistsWeLike)).append("\n");
    sb.append("    attire: ").append(StringUtil.toIndentedString(attire)).append("\n");
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
    sb.append("    descriptionHtml: ").append(StringUtil.toIndentedString(descriptionHtml)).append("\n");
    sb.append("    directedBy: ").append(StringUtil.toIndentedString(directedBy)).append("\n");
    sb.append("    displaySubtext: ").append(StringUtil.toIndentedString(displaySubtext)).append("\n");
    sb.append("    emails: ").append(StringUtil.toIndentedString(emails)).append("\n");
    sb.append("    features: ").append(StringUtil.toIndentedString(features)).append("\n");
    sb.append("    foodStyles: ").append(StringUtil.toIndentedString(foodStyles)).append("\n");
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
    sb.append("    location: ").append(StringUtil.toIndentedString(location)).append("\n");
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
    sb.append("}");*/
    return sb.toString();
  }
}
