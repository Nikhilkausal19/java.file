import turtle

# create a turtle object
t = turtle.Turtle()

# set the turtle's speed and pen color
t.speed(50)

# draw the red arc
t.pencolor("red")
t.fillcolor("red")
t.begin_fill()
t.right(90)
t.circle(50, 180)
t.end_fill()

# draw the orange arc
t.pencolor("orange")
t.fillcolor("orange")
t.begin_fill()
t.circle(50, 180)
t.end_fill()

# draw the yellow arc
t.pencolor("yellow")
t.fillcolor("yellow")
t.begin_fill()
t.circle(50, 180)
t.end_fill()

# draw the green arc
t.pencolor("green")
t.fillcolor("green")
t.begin_fill()
t.circle(50, 180)
t.end_fill()

# draw the blue arc
t.pencolor("blue")
t.fillcolor("blue")
t.begin_fill()
t.circle(50, 180)
t.end_fill()

# draw the purple arc
t.pencolor("purple")
t.fillcolor("purple")
t.begin_fill()
t.circle(50, 180)
t.end_fill()

# hide the turtle
t.hideturtle()

# keep the window open until it's manually closed
turtle.done()

