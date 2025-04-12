# Solution of homework 6

### Task 1: Chain of Responsibility

A support center system based on the Chain of Responsibility pattern. User issues are passed from one handler to the next until a suitable one is found. Each support level handles its own type of requests.

- Handlers: `FAQBotHandler`, `JuniorSupportHandler`, `SeniorSupportHandler`
- Issues: `password_reset`, `refund_request`, `account_ban`, etc.
- Menu: console interface (`menu.java`) where users input issue types
- Supported issues are automatically printed by each handler

### Task 2: Command

A smart home control system using the Command design pattern. The remote sends commands to devices without knowing how they perform them. Includes support for undoing actions.

- Devices: `Light`, `Thermostat`, `SmartSpeaker`
- Commands: `LightCommand`, `ThermostatCommand`, `PlayMusicCommand`
- Menu: `SmartHomeMenu` lets you turn on lights, play music, and set temperature
- Features:
  - Default temperature is 25°C
  - Current temperature is displayed before changing
  - Undo function for last executed command

### Author: Abdrakhmanova Adel
