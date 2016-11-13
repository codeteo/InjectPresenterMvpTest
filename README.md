# Injects different data for Production and Development

1. There are two different source sets. One is the Production and the other is
the Development environment. Those two correspond to the **prod** and **mock**
folders.

2. Using the Build Variant menu from the top left bottom of Android Studio we are
able to switch between prod and mock by choosing either **mockDebug** or **prodDebug**
Variants. We can also select Project View instead of Android View to view our
files.

3. `DataRepositoryModule` provides the `DataSource` of the source set we currently
working. That means we can have different data for the Production and different
data to work with when we are doing Development work. It also means we can do
work without currently having the backend fully functional.  
