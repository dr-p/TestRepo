package com.killer.recipes.allrecipekillerapp;

/**
 * Created by Christopher on 4/18/2016.
 */
public class RecipeServiceDEPRECATED {
    RecipeServiceNodeDEPRECATED root;
    private int numRecipes;

    public RecipeServiceDEPRECATED() {
        root = null;
        numRecipes = 0;
    }


    /* Primitive method, correct recursive method later
     * to find number of elements stored in tree
      * */
    public int getNumRecipes() {
        return numRecipes;
    }
    public void addRecipe(RecipeServiceNodeDEPRECATED a)
    {
        RecipeServiceNodeDEPRECATED newNode = new RecipeServiceNodeDEPRECATED(a.data);
        newNode.left = null;
        newNode.right = null;
        if (root == null)
            root = newNode;
        else
            addNode(newNode, root);
        numRecipes++;
    }

    /* To add node, recursive helper method */
    private void addNode(RecipeServiceNodeDEPRECATED newRecipe, RecipeServiceNodeDEPRECATED node) {
        if (newRecipe.data.getName().compareTo(node.data.getName()) < 0) {
            if (node.left == null)
                node.left = newRecipe;
            else
                this.addNode(newRecipe, node.left);
        } else if (newRecipe.data.getName().compareTo(node.data.getName()) > 0) {
            if (node.right == null)
                node.right = newRecipe;
            else
                this.addNode(newRecipe, node.right);
        }

    }


    public RecipeServiceNodeDEPRECATED getRecipeServiceNode(String target)
    {
        return searchTree(target, root);
    }



    private RecipeServiceNodeDEPRECATED searchTree(String recTarget, RecipeServiceNodeDEPRECATED rootNode) {
        RecipeServiceNodeDEPRECATED result;
        if (rootNode == null || rootNode.data.getName().compareTo(recTarget)  == 0)
            return rootNode;
        else if (rootNode.data.getName().compareTo(recTarget) > 0)
            result = searchTree(recTarget, rootNode.left);
        else
            result = searchTree(recTarget, rootNode.right);
        return result;
    }

    /**
     * count. Return the size of the library. Use
     * a recursive helper method.
     *
     * @return an int
     */
    public int count()
    {
        return countElements(0, root);
    }

        /* recursive helper method traversing and counting elements */

    private int countElements(int num, RecipeServiceNodeDEPRECATED base) {
        int result;
        if (base == null)
            return num;
        else if (base.right != null){
            result = countElements(num + 1, base.right);
        } else {
            result = countElements(num + 1, base.left);
        }
        return result;
    }


    public void printInOrder()
    {
        printTree(root);
    }
    public  void printTree(RecipeServiceNodeDEPRECATED base) {
        if (base == null) {
            return;
        }
        printTree(base.left);
        System.out.print(base.toString() + " ");
        printTree(base.right);
    }

    public void printInReverseOrder()
    {
        printTreeReverse(root);
    }
    public static void printTreeReverse(RecipeServiceNodeDEPRECATED base) {
        if (base == null) {
            return;
        }
        printTreeReverse(base.right);
        System.out.print(base.toString() + " ");
        printTreeReverse(base.left);
    }
    public int getHeight() {
        return getTreeHeight(root);
    }

    private int getTreeHeight(RecipeServiceNodeDEPRECATED rootNode) {
        if (rootNode == null)
            return -1;

        int left = getTreeHeight(rootNode.left);
        int right = getTreeHeight(rootNode.right);

        if (left > right)
            return left + 1;
        else
            return right + 1;
    }

    public RecipeServiceNodeDEPRECATED removeNode(RecipeDEPRECATED targetNum) {
        return remove(targetNum, root);
    }

    private RecipeServiceNodeDEPRECATED remove(RecipeDEPRECATED target, RecipeServiceNodeDEPRECATED rootTemp )
    {
        if( rootTemp == null )
            return rootTemp;   // Item not found; do nothing
        if( target.getName().compareTo(rootTemp.data.getName() ) < 0 )
            rootTemp.left = remove(target, rootTemp.left );
        else if( target.getName().compareTo(rootTemp.data.getName() ) > 0 )
            rootTemp.right = remove(target, rootTemp.right );
        else if( rootTemp.left != null && rootTemp.right != null ) // Two children
        {
            rootTemp.data = findMin(rootTemp.right ).data;
            rootTemp.right = remove(rootTemp.data, rootTemp.right );
        }
        else
            rootTemp = ( rootTemp.left != null ) ? rootTemp.left : rootTemp.right;
        numRecipes--;
        return rootTemp;
    }
    private RecipeServiceNodeDEPRECATED findMin(RecipeServiceNodeDEPRECATED targetToCheck )
    {
        if( targetToCheck == null )
            return null;
        else if( targetToCheck.left == null )
            return targetToCheck;
        return findMin(targetToCheck.left );
    }
}
