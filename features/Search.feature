Feature: Search of various categoreies should be possible along with product search

It is good to provide an option  to our end users where they can search for the products
based on their categorary, rather than only searching a product. Thiss will increase oir business 
and make end users happy.

Background:
Given I visist the site as a guest user

@SmokeTest @All @Books @wip
Scenario: Search for the products under Books category
When I select "Books" option on the search category dropdown
And I click on the search icon
Then I should see the "books" page loaded
And I should see "Books at Amazon" as headline
But I should not see the other category products

@All @Baby @ignore
Scenario: Search for the products under Baby category
When I select "Baby" option on the search category dropdown
And I click on the search icon
Then I should see the "baby" page loaded
And I should see "The Baby Store" as headline
But I should not see the other category products