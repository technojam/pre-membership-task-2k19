#include <iostream>

using namespace std;

int map[10][10];//LANDSCAPE

int migrateCrowd(int size,int i,int j)
{
    map[i-1][j]+=1;//DISPLACING 1 PERSON TO THE ROW ABOVE THE OVERCROWDED ROW AND IN THE SAME COLUMN
    map[i+1][j]+=1;//DISPLACING 1 PERSON TO THE ROW BELOW THE OVERCROWDED ROW AND IN THE SAME COLUMN
    map[i][j-1]+=1;//DISPLACING 1 PERSON TO THE COLUMN LEFT THE OVERCROWDED COLUMN AND IN THE SAME ROW
    map[i][j+1]+=1;//DISPLACING 1 PERSON TO THE COLUMN RIGHT THE OVERCROWDED COLUMN AND IN THE SAME ROW
    map[i][j]=0;//REMOVING ALL THE PERSONS FOR THE OVERCROWDED CELL OF THE LANDSCAPE
}

int findIfCrowded(int size)
{
    int i,j;
    for(i=0;i<size;i++)
    {
        for(j=0;j<size;j++)
        {
            if(map[i][j]==4)//FINDING THE OVERCROWDED CELL
            {
                migrateCrowd(size,i,j);//MIGRATING PEOPLE FROM THE OVERCROWDED CELL
                findIfCrowded(size);//CHECKING FOR THE PREVIOUS CELL THAT THEY ARE NOT OVERCROWEDED NOW
            }
        }
    }
}

int main()
{
    int size,i,j,sum=0;
    cout<<"Enter the size of the landscape: ";
    cin>>size;//TAKING SIZE OF THE LANDSCAPE
    cout<<"Enter the people on the landscape: ";
    for(i=0;i<size;i++)
    {
        cout<<"row: "<<i+1;//TAKING THE INPUT OF RESPECTIVE ROW
        for(j=0;j<size;j++)
        {
            cout<<"column "<<j+1<<": ";//TAKING THE INPUT OF RESPECTIB=VE COLUMNS
            cin>>map[i][j];
            sum+=map[i][j];//COUNTING THE NUMBER OF PERSON ON THE LANDSCAPE
        }
    }
    if(sum<=size*size*3)//IF THE MAP IS HAVING TOTAL NUMBER OF PERSONS LANDSCAPE CAN HAVE IS MORE THEN NUMBER OF PEOPLE ON THE LANDSCAPE
    {
        findIfCrowded(size);//FINDING CELL WITH OVERCROWDED CELL
        cout<<"Landscape after all migrations is:";//DISPLAYING  THE LANDSCAPE AFTER THE MIGRATION OF THE PEOPLE
        for(i=0;i<size;i++)
        {
            cout<<"\n";
            for(j=0;j<size;j++)
            {
                cout<<map[i][j]<<" ";
            }
        }
    }
    else
    {
        cout<<"The landscape can not be overcrowded in any way as it can only acquire a maximum of "<<size*size*3<<" person but there are "<<sum<<" person on the landscape";
    }
}
