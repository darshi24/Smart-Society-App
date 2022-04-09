# Smart Society App :houses::office:
### An android app for society/residential building management. Watch demo video [here](https://www.youtube.com/watch?v=RXhyF0sE8dE&t).

## Motivation for this app :bulb:

For my undergraduate course 'Fundamentals of Software Engineering' we had to build a software application following Agile development approach and carrying out all the phases of the SDLC. Our professor didn't just ask us to come up with a project idea, rather he asked us to come up with a problem that we noticed/experienced around us and then come up with a software based solution for it. On brainstorming and observing problem cases aroud me, I cam up with an idea to build this app. I noticed that the caretaker of my building always came with these paper receipts, receipts for the maintenance fees paid by the residents, to distribute to each house as instructed by the secretary. It clicked to me that this very process can be automated so that it saves time, paper and the poor caretaker's multiple trips to each apartment. 

This app is made for every such secretary of a society who needs to keep track of the residents' maintenance fee payments. To avoid all the hassle with paper receipts like organizing and delivering them manually, this Android application eases that process by generating maintenance payment receipts of each resident/house in the society automatically and sends it immediately to the residents through WhatsApp with just a click by the secretary. Later, we added many more features that facilitate smooth functioning in a community, all discussed below.

## :woman_office_worker: Feature 1 - Sign up as a secretary :office_worker:

As a secretary, you need to register your society/building by providing some details. You will then receive a code which you can share to the residents so that they can register to the app as well. This code is a must to sign in as a resident. Somebody who doesn't have this code won't be able to join this society's group. During signing up, the secretary also adds details required to be displayed on the receipts later.
<p align = "center">
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/secretary%20entering%20society%20name%20first%20time.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/login%20secretary.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/enter%20receipt%20details.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/get%20code%20option%20for%20secretary.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/secretary%20gets%20code.png", height = 400, width = 300/>
</p>
                                                                                                     
## :family_man_woman_girl_girl: Feature 2 - Sign up as a resident :family_man_woman_girl_girl:
Enter the code you secretary has provided, and provide some details about you and your family. Ideally only one member of the house should register but other members can register as well. 
<p align = "center">
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/resident%20entering%20code%20before%20logging%20in.png", height = 400, width = 300/>
</p>

## :page_with_curl: Feature 3 - Send receipts for Maintenance fee payment :page_with_curl:
The secreatary can create cycles according to how often the residents pay a maintenance fee. Then, the secretary can view a list of all residents for each cycle where he/she can change the status of their payment by clicking 'Done' which also redirects the secretary to whatsapp where an automatically generated PDF can be sent to the appropriate resident.
<p align = "center">
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/creating%20a%20cycle%20for%20receipts.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/getting%20list%20of%20residents%20in%20receipts%20module.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/sending%20receipt%20on%20whatsapp.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/receipt%20sent%20on%20whatsapp.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/full%20view%20of%20how%20receipts%20look.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/close%20up%20of%20how%20receipt%20looks.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/one%20resident%20paid.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/viewing%20previous%20reports.png", height = 400, width = 300/>
</p>

## :clipboard: Feature 4 - Notice board :clipboard:
The secretary can publish any notices for the residents to view them. 
<p align = "center">
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/creating%20notice.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/view%20of%20two%20notices%20created.png", height = 400, width = 300/>
</p>

## :ballot_box::heavy_check_mark: Feature 5 - Vote on an issue :ballot_box::x:
Often there are small, trivial issues which need to be concluded quickly. Coordinating a time for all the residents so that there can be a meeting is tough. This module addresses this problem. The secretary can post an issue and the residents can vote a simple Yes or No to that issue.
<p align = "center">
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/vote%20on%20issue%20-%20creating%20issue.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/issue%20created%20for%20voting.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/how%20rsidents%20see%20the%20issues.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/how%20secretary%20sees%20the%20issues%20after%20someone%20votes.png", height = 400, width = 300/>
</p>

## :inbox_tray: Feature 6 - Complaint box :inbox_tray:
The residents can anonymously post complaints for the secretary and everybody else to see.
<p align = "center">
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/making%20a%20complaint.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/how%20complaint%20looks.png", height = 400, width = 300/>
</p>

## :repeat: Feature 7 - Change secretary :repeat:
This feature allows a secretary to change to a resident role. Upon changing to a this role, the secretary will get a code which can be shared to the resident who is going to be the new secretary. Using this code, the resident can now change to his/her new secretary role. 
<p align = "center">
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/change%20user%20type%20option.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/code%20for%20new%20secretary.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/change%20user%20type%20for%20resident%20to%20secretary.png", height = 400, width = 300/>
  <img src="https://github.com/darshi24/society-app/blob/main/app_images/asking%20resident%20to%20enter%20code%20to%20change%20to%20secretary.png", height = 400, width = 300/>
</p>
