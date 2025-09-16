# Server Modules - Custom Minigames

Repository for custom-developed minigames and shared utilities.

## Structure

- `custom-minigames/` - Individual custom minigame plugins
- `shared-libraries/` - Common utilities and components

## Current Minigames

### Rush Game

A racing minigame with obstacles and checkpoints.

**Features:**

- Player racing mechanics
- Obstacle courses
- Checkpoint system
- Leaderboards

## Building

```bash

# Build all modules

mvn clean package

# Build specific module

cd custom-minigames/rush-game
mvn clean package