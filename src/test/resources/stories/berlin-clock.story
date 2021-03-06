Story: The Berlin Clock

Meta:
@scope interview

Narrative:
    As a clock enthusiast
    I want to tell the time using the Berlin Clock
    So that I can increase the number of ways that I can read the time

Scenario: Midnight
When the time is 00:00:00
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Middle of the afternoon
When the time is 13:17:01
Then the clock should look like
Y
RROO
RRRO
YYROOOOOOOO
YOOO

Scenario: Just before midnight
When the time is 23:59:59
Then the clock should look like
Y
RRRR
RRRO
YYRYYRYYRYY
YYYY


