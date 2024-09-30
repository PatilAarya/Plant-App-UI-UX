## Plant App

**Welcome to Plant App**, a user-friendly and feature-packed mobile application designed to assist plant lovers in taking care of their plants with ease.

### Features

* **Recommended Plants:** Get plant suggestions based on your needs.
* **Featured Plants:** Check out popular plants on the home screen.
* **Easy Navigation:** Find details on:
    - Weeds: Info about harmful weeds.
    - Insects: Common plant insects and how to deal with them.
    - Diseases: Plant diseases and ways to prevent them.
    - Products: Tools and products to help your plants.
    - Help Section: Reach out for support or FAQs.

### App Structure

#### Adapters

* FeaturedPlantAdapter
* GroupAdapter
* ItemDetailAdapter
* RecommendPlantAdapter

#### Fragments

* HomeFragment
* ProfileFragment
* FavouriteFragment
* DiseasesFragment
* InsectsFragment
* ProductsFragment
* HelpFragment
* WeedsFragment

#### Models

* Group
* Plant

#### Activities

* MainActivity
* ItemDetailActivity
* BuyNowActivity
* DescriptionActivity

### Layouts & UI Elements

* Custom layouts for each fragment and activity, including intuitive navigation bars and visually appealing backgrounds (e.g., bg_half_bottom.xml, featured_bg.xml).
* Rich graphical assets: A wide range of icons (e.g., ic_plant.xml, ic_profile.xml, ic_bug.xml) and background images (e.g., diseases_image.png, insects_image.png, weeds_image.png) to create an immersive user experience.

### Project Structure
app/
├── manifests/
│   └── AndroidManifest.xml
├── java/
│   └── com.example.plantappui/
│       ├── adapter/
│       ├── fragment/
│       ├── model/
│       └── activities/
├── res/
│   ├── drawable/
│   ├── layout/
│   └── menu/
└── test/

### Tools & Technologies

* Android Studio for app development
* Java for backend logic
* XML for designing UI components
* Custom Drawables to enhance user interface and provide visual clarity

### Contributing

Contributions are welcome! If you'd like to improve the app, feel free to open an issue or create a pull request.
