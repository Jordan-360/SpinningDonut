# 🍩 Spinning ASCII Donut (Java)

A classic **spinning 3D donut rendered entirely in ASCII**, written in pure Java and displayed directly in the terminal 💻✨  
Inspired by the legendary `donut.c` demo, this project showcases 3D math, perspective projection, and terminal animation using nothing but characters.

---

## 🎬 Demo

When run, the program displays a continuously rotating torus (donut shape) using ASCII characters like: .,-~:;=!*#$@

These characters simulate lighting and depth as the donut spins in real time 🔄

⚠️ Best viewed in a monospace terminal with ANSI escape support.

---

## 🚀 Features

- 🔁 Real-time 3D rotation  
- 🌈 ASCII shading based on surface lighting  
- 📐 Z-buffer depth handling  
- 🎞️ Smooth animation loop  
- 📦 No external libraries required  

---

## 🧠 How It Works

- 🍩 The donut is modeled using **parametric equations** for a torus  
- 🔄 Two angles control rotation around different axes  
- 📽️ 3D points are projected into 2D screen space  
- 🧱 A **z-buffer** ensures closer points overwrite farther ones  
- 💡 Lighting is calculated using surface normals and mapped to ASCII characters  
- 🖥️ The terminal screen is redrawn every frame using ANSI escape codes  

---

## 🛠️ Requirements

- ☕ Java 8 or newer  
- 🖥️ A terminal that supports ANSI escape sequences  
  (Linux, macOS, Windows Terminal, or similar)

---

## ▶️ How to Run

### Compile

```bash
javac Main.java
Run
bash
Copy code
java Main
⛔ Stop the program anytime with Ctrl + C

📁 Project Structure
css
Copy code
.
├── Main.java
└── README.md
🎨 Customization Ideas
Have fun tweaking it! 😄
You can easily:

📏 Change terminal width and height

⚡ Adjust rotation speed

🕒 Modify frame delay for smoother or faster animation

🔤 Experiment with different ASCII shading characters

⚠️ Limitations
🔄 Resizing the terminal during runtime may distort the output

🔠 Requires a monospace font for correct proportions

🧓 ANSI escape codes may not work in very old consoles
