# Smart Society App :houses::office:
### An android app for society/residential building management. Watch demo video [here](https://www.youtube.com/watch?v=RXhyF0sE8dE&t).

## Motivation for this app :bulb:

For my undergraduate course 'Fundamentals of Software Engineering' we had to build a software application following Agile development approach and carrying out all the phases of the SDLC. Our professor didn't just ask us to come up with a project idea, rather he asked us to come up with a problem that we noticed/experienced around us and then come up with a software based solution for it. On brainstorming and observing problem cases aroud me, I cam up with an idea to build this app. I noticed that the caretaker of my building always came with these paper receipts, receipts for the maintenance fees paid by the residents, to distribute to each house as instructed by the secretary. It clicked to me that this very process can be automated so that it saves time, paper and the poor caretaker's multiple trips to each apartment. 

This app is made for every such secretary of a society who needs to keep track of the residents' maintenance fee payments. To avoid all the hassle with paper receipts like organizing and delivering them manually, this Android application eases that process by generating maintenance payment receipts of each resident/house in the society automatically and sends it immediately to the residents through WhatsApp with just a click by the secretary. Later, we added many more features that facilitate smooth functioning in a community, all discussed below.

## :woman_office_worker: Feature 1 - Sign up as a secretary :office_worker:

As a secretary, you need to register your society/building by providing some details. You will then receive a code which you can share to the residents so that they can register to the app as well. This code is a must to sign in as a resident. Somebody who doesn't have this code won't be able to join this society's group.

## :family_man_woman_girl_girl: Feature 2 - Sign up as a resident :family_man_woman_girl_girl:
Enter the code you secretary has provided, and provide some details about you and your family. Ideally only one member of the house should register but other members can register as well. 

## :page_with_curl: Feature 3 - Send receipts for Maintenance fee payment :page_with_curl:
The secreatary can create cycles according to how often the residents pay a maintenance fee. Then, the secretary can view a list of all residents for each cycle where he/she can change the status of their payment by clicking 'Done' which also redirects the secretary to whatsapp where an automatically generated PDF can be sent to the appropriate resident.

## :clipboard: Feature 4 - Notice board :clipboard:
The secretary can publish any notices for the residents to view them. 

## :ballot_box::heavy_check_mark: Feature 5 - Vote on an issue :ballot_box::x:
Often there are small, trivial issues which need to be concluded quickly. Coordinating a time for all the residents so that there can be a meeting is tough. This module addresses this problem. The secretary can post an issue and the residents can vote a simple Yes or No to that issue.

## :inbox_tray: Feature 6 - Complaint box :inbox_tray:
The residents can anonymously post complaints for the secretary and everybody else to see.

## :repeat: Feature 7 - Change secretary :repeat:
This feature allows a secretary to change to a resident role. Upon changing to a this role, the secretary will get a code which can be shared to the resident who is going to be the new secretary. Using this code, the resident can now change to his/her new secretary role. 
